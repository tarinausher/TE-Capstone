package com.techelevator.model;

public class Degree {
    private int degreeId;
    private String institution;
    private String level;
    private String degreeType;
    private String subjectArea;

    /*
    Degree is referring to previous academic experience a student may have
     */

    public Degree() {
    }

    public Degree(int degreeId, String institution, String level, String degreeType, String subjectArea) {
        this.degreeId = degreeId;
        this.institution = institution;
        this.level = level;
        this.degreeType = degreeType;
        this.subjectArea = subjectArea;
    }

    public int getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(int degreeId) {
        this.degreeId = degreeId;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getType() {
        return degreeType;
    }

    public void setType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getSubjectArea() {
        return subjectArea;
    }

    public void setSubjectArea(String subjectArea) {
        this.subjectArea = subjectArea;
    }

    @Override
    public String toString() {
        return "AcademicExperience{" +
                "degreeId=" + degreeId +
                ", institution='" + institution + '\'' +
                ", level='" + level + '\'' +
                ", degreeType=" + degreeType + '\'' +
                ", subjectArea='" + subjectArea + '\'' +
                '}';
    }
}
