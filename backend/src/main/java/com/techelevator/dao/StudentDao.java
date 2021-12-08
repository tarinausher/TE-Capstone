package com.techelevator.dao;

import com.techelevator.model.Student;

import java.util.List;

public interface StudentDao {

    //Student profile is created upon new account creation
    boolean createProfile(int userId);
    //IMPORTANT: TODO: NEED TO EDIT THIS BASED ON HOW DATABASE IS ADJUSTED

    /*
    Student should have the ability to update information in their profiles
    TODO: updateStudentFirstName,
    TODO: updateStudentLastName,
    TODO: updateProfileSummary,
    TODO: updateAcademicExperience,
    TODO: updateCareerExperience,
    TODO: updateSoftSkills,
    TODO: updateContactPreferences,
    TODO: updateInterests
    */

    //Student can publish their profile when ready
    void updateIsPublished(boolean isPublished, int userId);

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
    Student profile should be searchable by cohortId, highest degree obtained, prior industry experience, and technologies used:
    TODO: searchStudentsByCohortID,
    TODO: searchStudentsByDegree,
    TODO: searchStudentsByIndustry,
    TODO: searchStudentsByTechUsed
    */

}
