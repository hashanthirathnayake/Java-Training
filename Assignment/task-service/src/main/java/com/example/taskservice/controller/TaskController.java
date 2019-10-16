package com.example.taskservice.controller;

import com.example.taskservice.model.Task;
import com.example.taskservice.service.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    TaskServiceImpl taskService;

    @RequestMapping("/tasks")
   // @PreAuthorize("hasAuthority('read_profile')")
    public List<Task> getTasks(){
        return taskService.getTasks();
    }

    @RequestMapping(value = "/tasks",method = RequestMethod.POST)
    //@PreAuthorize("hasAuthority('write_profile')")
    public Task save(@RequestBody Task task){
        return taskService.save(task);
    }

    @RequestMapping(value = "/tasks/{ids}",method = RequestMethod.GET)
    //@PreAuthorize("hasAuthority('read_profile')")
    public List<Task> getTask(@PathVariable List<Integer> ids){
        return taskService.getTasksList(ids);
    }

}
