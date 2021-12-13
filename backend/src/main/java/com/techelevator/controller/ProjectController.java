package com.techelevator.controller;

import com.techelevator.dao.ProjectDao;
import com.techelevator.model.Project;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class ProjectController {

    private ProjectDao projectDao;

    public ProjectController(ProjectDao projectDao) {
        this.projectDao = projectDao;
    }

    @PostMapping(path = "/project")
    void createProject(Project newProject) {

    }

    @PutMapping(path = "/project/title")
    public void updateTitle(Project updatedProject) {

    }

    @PutMapping(path = "/project/description")
    void updateDescription(Project updatedProject) {

    }

    @PutMapping(path = "project/is-solo")
    void updateIsSolo(Project updatedProject) {

    }

    @PutMapping(path = "project/technologies")
    void updateTechnologies(Project updatedProject) {

    }

    @PutMapping(path = "project/link")
    void updateLink(Project updatedProject) {

    }
}
