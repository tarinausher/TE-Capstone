package com.techelevator.model;

import java.util.List;

public class Student {
    private int userId;
    private int profileId;
    private int cohortId;
    private String firstName;
    private String lastName;
    private String summary;
    private String softSkills;
    private String contactPreferences;
    private String techInterests;
    private boolean isPublished;

    private Experience experience;
    private Portfolio portfolio;
    private List<Degree> degrees;

    /*
    Student class represents the student user and their data; student users have profiles in which
    they can add and edit data on profile as needed. Profile information is pulled from Student data.
     */

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public int getCohortId() {
        return cohortId;
    }

    public void setCohortId(int cohortId) {
        this.cohortId = cohortId;
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

    public String getTechInterests() {
        return techInterests;
    }

    public void setTechInterests(String techInterests) {
        this.techInterests = techInterests;
    }

    public boolean isPublished() {
        return isPublished;
    }

    public void setPublished(boolean published) {
        isPublished = published;
    }
}
