package com.techelevator.model;

public class Project {
    private int projectId;
    private int userId;
    private String title;
    private String description;
    private boolean isSolo;
    private String technologies;
    private String link;

    public Project(int projectId, int userId, String title, String description, boolean isSolo, String technologies, String link) {
        this.projectId = projectId;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.isSolo = isSolo;
        this.technologies = technologies;
        this.link = link;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isSolo() {
        return isSolo;
    }

    public void setSolo(boolean solo) {
        isSolo = solo;
    }

    public String getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
