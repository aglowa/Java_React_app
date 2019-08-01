package com.example.demo.web;

import com.example.demo.domain.ProjectTask;
import com.example.demo.service.ProjectTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/api/board")
    @CrossOrigin
    public class ProjectTaskController {

        @Autowired
        private ProjectTaskService projectTaskService;

        @PostMapping("")
        public ResponseEntity<?> addPTToBoard(@RequestBody ProjectTask projectTask){

        ProjectTask newPT = projectTaskService.saveOrUpdateProjectTask(projectTask);

        return new ResponseEntity<ProjectTask>(newPT, HttpStatus.CREATED);
        }
}
