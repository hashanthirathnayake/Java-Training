package com.example.employeeservice.service;

import com.example.employeeservice.model.AssignTask;
import com.example.employeeservice.model.Employee;
import com.example.employeeservice.model.Project;
import com.example.employeeservice.model.Task;
import com.example.employeeservice.repository.AssignTaskRepostory;
import com.example.employeeservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl {
    @Autowired
    EmployeeRepository employeeRepository;



    @Autowired
    AssignTaskRepostory assignTaskRepostory;

    @Autowired
    RestTemplate restTemplate;

    @Bean
    RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    public Employee getEmployee(Integer id){
        Optional<Employee> employee = employeeRepository.findById(id);
        if(!employee.isPresent()){
            System.out.println("Incorrect ID");

        }
        return employee.get();
    }

    public List<AssignTask> saveAssignTask(List<AssignTask> assignTasks){
        return assignTaskRepostory.saveAll(assignTasks);
    }

    public List<Project> getProjects(Integer eid){
        List<AssignTask> assignTasks = assignTaskRepostory.findByEid(eid);

        String projectIds = assignTasks.stream().map(s->String.valueOf(s.getPid())).collect(Collectors.joining(","));

        if(projectIds.equals(null)||projectIds.equals("")){

            return null;

        } else {
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.add("Authorization", AccessTokenConfigurer.getToken());
            HttpEntity<Project> projectHttpEntity = new HttpEntity<Project>(httpHeaders);
            ResponseEntity<List> responseEntity = restTemplate.exchange("http://localhost:8284/projects/{ids}", HttpMethod.GET, projectHttpEntity, List.class, projectIds);

            return responseEntity.getBody();
        }
    }

    public List<Task> getTasks(Integer pid){
        List<AssignTask> assignTasks = assignTaskRepostory.findByPid(pid);
        String taskIds = assignTasks.stream().map(s->String.valueOf(s.getTid())).collect(Collectors.joining(","));
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Authorization", AccessTokenConfigurer.getToken());
        HttpEntity<Task> taskHttpEntity = new HttpEntity<Task>(httpHeaders);
        ResponseEntity<List> responseEntity = restTemplate.exchange("http://localhost:8285/tasks/{ids}", HttpMethod.GET, taskHttpEntity, List.class, taskIds);

        return responseEntity.getBody();

    }
}
