package com.example.taskservice.service;


import com.example.taskservice.model.Task;
import com.example.taskservice.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Service
public class TaskServiceImpl {
    @Autowired
    TaskRepository taskRepository;

    public Task save(Task task){
        return taskRepository.save(task);
    }

    public List<Task> getTasks(){
        return taskRepository.findAll();
    }

    public List<Task> getTasksList(List<Integer> ids){
        return taskRepository.findByIdIn(ids);
    }

    }
