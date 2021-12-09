package com.techelevator.dao;

import com.techelevator.model.Project;

import java.util.List;

public interface ProjectDao {

    void createProject(Project newProject);

    List<Project> getProjectsByUserId(int userId);

    void updateTitle(Project updatedProject);
    void updateDescription(Project updatedProject);
    void updateIsSolo(Project updatedProject);
    void updateTechnologies(Project updatedProject);
    void updateLink(Project updatedProject);

    void deleteProject(int projectId, int userId);

}
