package com.techelevator.model;

import java.time.LocalDate;

public class Experience {
    private int experienceId;
    private int userId;
    private String industry;
    private String title;
    private String organization;
    private LocalDate dateStarted;
    private LocalDate dateEnded;
    private String description;

    public Experience(int experienceId, int userId, String industry, String title, String organization, LocalDate dateStarted, LocalDate dateEnded, String description) {
        this.experienceId = experienceId;
        this.userId = userId;
        this.industry = industry;
        this.title = title;
        this.organization = organization;
        this.dateStarted = dateStarted;
        this.dateEnded = dateEnded;
        this.description = description;
    }

    public Experience() {
    }

    public int getExperienceId() {
        return experienceId;
    }

    public void setExperienceId(int experienceId) {
        this.experienceId = experienceId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public LocalDate getDateStarted() {
        return dateStarted;
    }

    public void setDateStarted(LocalDate dateStarted) {
        this.dateStarted = dateStarted;
    }

    public LocalDate getDateEnded() {
        return dateEnded;
    }

    public void setDateEnded(LocalDate dateEnded) {
        this.dateEnded = dateEnded;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // @Override
    // public String toString() {
    //     return "CareerExperience{" +
    //             "entryId=" + entryId +
    //             ", industry='" + industry + '\'' +
    //             ", jobTitle='" + title + '\'' +
    //             ", organization=" + organization + '\'' +
    //             ", dateStarted='" + dateStarted + '\'' +
    //             ", dateEnded='" + dateEnded + '\'' +
    //             ", description='" + description + '\'' +
    //             '}';
    // }
}
