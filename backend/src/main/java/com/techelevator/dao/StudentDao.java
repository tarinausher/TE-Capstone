package com.techelevator.dao;

import com.techelevator.model.Student;

import java.util.List;

public interface StudentDao {

    //Student profile is created upon new account creation
    void createProfile(Student newStudent);

    //Student should have the ability to update information in their profiles
    void updateFirstName(Student updatedStudent);
    void updateLastName(Student updatedStudent);
    void updateProfileSummary(Student updatedStudent);
    void updateSoftSkills(Student updatedStudent);
    void updateContactPreferences(Student updatedStudent);
    void updateInterests(Student updatedStudent);

    //Student can publish their profile when ready
    public void updateIsPublished(Student updatedStudent);

    //Users should be able to browse students by cohort number
    List<Student> getStudentsByCohortId(int cohortId);

    //Users should be able to view all students with published profiles
    List<Student> getAllStudents();

    //Individual student profiles should be retrieved when selected
    Student getStudentByProfileId(int profileId);
    Student getStudentByUserId(int userId);

    //Staff may be able to see student profiles if not published
    List<Student> getUnpublishedProfiles();

    /*
    TODO: Determine if these methods are needed based on API
    Student profile should be searchable by cohortId, highest degree obtained, prior industry experience, and technologies used:
    */

}
