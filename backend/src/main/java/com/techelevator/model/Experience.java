package com.techelevator.model;

public class Experience {
    private int entryId;
    private String industry; //TODO THIS NEEDS TO BE ADDED TO THE DATABASE
    private String title;
    private String organization;
    private String dateStarted;
    private String dateEnded;
    private String description;

    /*
    Experience is referring to previous career experience a student may have
     */

    public Experience(int entryId, String industry, String title, String organization, String dateStarted, String dateEnded, String description) {
        this.entryId = entryId;
        this.industry = industry;
        this.title = title;
        this.organization = organization;
        this.dateStarted = dateStarted;
        this.dateEnded = dateEnded;
        this.description = description;
    }

    public int getEntryId() {
        return entryId;
    }

    public void setEntryId(int entryId) {
        this.entryId = entryId;
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

    public String getDateStarted() {
        return dateStarted;
    }

    public void setDateStarted(String dateStarted) {
        this.dateStarted = dateStarted;
    }

    public String getDateEnded() {
        return dateEnded;
    }

    public void setDateEnded(String dateEnded) {
        this.dateEnded = dateEnded;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CareerExperience{" +
                "entryId=" + entryId +
                ", industry='" + industry + '\'' +
                ", jobTitle='" + title + '\'' +
                ", organization=" + organization + '\'' +
                ", dateStarted='" + dateStarted + '\'' +
                ", dateEnded='" + dateEnded + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
