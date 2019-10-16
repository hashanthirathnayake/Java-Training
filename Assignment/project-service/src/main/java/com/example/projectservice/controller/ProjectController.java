package com.example.projectservice.controller;

import com.example.projectservice.model.Project;
import com.example.projectservice.service.ProjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {
    @Autowired
    ProjectServiceImpl projectService;

    @RequestMapping(value = "/projects")
    //@PreAuthorize("hasAuthority('read_profile')")
    public List<Project> getProjects(){
        return projectService.getProjects();
    }

    @RequestMapping(value = "/projects",method = RequestMethod.POST)
    //@PreAuthorize("hasAnyAuthority('write_profile')")
    public Project save(@RequestBody Project project){
        return projectService.save(project);
    }

    @RequestMapping(value = "/projects/{ids}",method = RequestMethod.GET)
    //@PreAuthorize("hasAuthority('read_profile')")
    public List<Project> getTask(@PathVariable List<Integer> ids){
        return projectService.getProjectsList(ids);
    }
}
