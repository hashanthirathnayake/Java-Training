package com.example.projectservice.service;

import com.example.projectservice.model.Project;
import com.example.projectservice.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Service
public class ProjectServiceImpl {
    @Autowired
    ProjectRepository projectRepository;


    public List<Project> getProjects(){

        return projectRepository.findAll();
    }

    public Project save(Project project){
        return projectRepository.save(project);
    }

    public List<Project> getProjectsList(List<Integer> ids){
        return projectRepository.findByIdIn(ids);
    }

}
