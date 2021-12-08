package com.techelevator.model;

import java.util.List;

public class Student {
    private int userId;
    private Cohort cohort;
    private String firstName;
    private String lastName;
    private String summary;
    private List<Project> projects;
    private List<Degree> degrees;
    private List<Experience> experiences;
    private String technologies;
    private String softSkills;
    private String contactPreferences;
    private String lastUpdated;
    private boolean isPublished;

    public Student() {

    }
    public Student(int userId, Cohort cohort, String firstName, String lastName, String summary, List<Project> projects, List<Degree> degrees, List<Experience> experiences, String technologies, String softSkills, String contactPreferences, String lastUpdated, boolean isPublished) {
        this.userId = userId;
        this.cohort = cohort;
        this.firstName = firstName;
        this.lastName = lastName;
        this.summary = summary;
        this.projects = projects;
        this.degrees = degrees;
        this.experiences = experiences;
        this.technologies = technologies;
        this.softSkills = softSkills;
        this.contactPreferences = contactPreferences;
        this.lastUpdated = lastUpdated;
        this.isPublished = isPublished;
    }

    public String highestDegreeLevel() {
        for(Degree degree : degrees) {
            if(degree.getLevel().equals("doctorate")) {
                return "doctorate";
            }
        }

        for(Degree degree : degrees) {
            if(degree.getLevel().equals("masters")) {
                return "masters";
            }
        }

        for(Degree degree : degrees) {
            if(degree.getLevel().equals("bachelors")) {
                return "bachelors";
            }
        }

        for(Degree degree : degrees) {
            if(degree.getLevel().equals("associates")) {
                return "associates";
            }
        }

        for(Degree degree : degrees) {
            if(degree.getLevel().equals("high-school")) {
                return "high-school";
            }
        }

        for(Degree degree : degrees) {
            if(degree.getLevel().equals("trade")) {
                return "trade";
            }
        }

        return "none";
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Cohort getCohort() {
        return cohort;
    }

    public void setCohort(Cohort cohort) {
        this.cohort = cohort;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<Degree> getDegrees() {
        return degrees;
    }

    public void setDegrees(List<Degree> degrees) {
        this.degrees = degrees;
    }

    public List<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<Experience> experiences) {
        this.experiences = experiences;
    }

    public String getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }

    public String getSoftSkills() {
        return softSkills;
    }

    public void setSoftSkills(String softSkills) {
        this.softSkills = softSkills;
    }

    public String getContactPreferences() {
        return contactPreferences;
    }

    public void setContactPreferences(String contactPreferences) {
        this.contactPreferences = contactPreferences;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public boolean isPublished() {
        return isPublished;
    }

    public void setPublished(boolean published) {
        isPublished = published;
    }
}