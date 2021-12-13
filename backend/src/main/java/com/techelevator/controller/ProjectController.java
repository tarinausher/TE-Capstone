package com.techelevator.controller;

import com.techelevator.dao.ProjectDao;
import com.techelevator.model.Project;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ProjectController {

    private ProjectDao projectDao;

    public ProjectController(ProjectDao projectDao) {
        this.projectDao = projectDao;
    }

    @PostMapping(path = "/project")
    void createProject(Project updatedProject) {
        projectDao.createProject(updatedProject);
    }

    @PutMapping(path = "/project/title")
    public void updateTitle(Project updatedProject) {
        projectDao.updateTitle(updatedProject);
    }

    @PutMapping(path = "/project/description")
    void updateDescription(Project updatedProject) {
        projectDao.updateDescription(updatedProject);
    }

    @PutMapping(path = "project/is-solo")
    void updateIsSolo(Project updatedProject) {
        projectDao.updateIsSolo(updatedProject);
    }

    @PutMapping(path = "project/technologies")
    void updateTechnologies(Project updatedProject) {
        projectDao.updateTechnologies(updatedProject);
    }

    @PutMapping(path = "project/link")
    void updateLink(Project updatedProject) {
        projectDao.updateLink(updatedProject);
    }
}
