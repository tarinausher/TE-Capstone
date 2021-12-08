package com.techelevator.model;

public class Cohort {
    private int cohort_id;
    private String description;
    private String end_date;

    public Cohort(int cohort_id, String description, String end_date) {
        this.cohort_id = cohort_id;
        this.description = description;
        this.end_date = end_date;
    }

    public int getCohort_id() {
        return cohort_id;
    }

    public void setCohort_id(int cohort_id) {
        this.cohort_id = cohort_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }
}
