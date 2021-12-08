package com.techelevator.dao;

import com.techelevator.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.ArrayList;
import java.util.List;

public class JdbcStudentDao implements StudentDao{
    private JdbcTemplate jdbcTemplate;

    public JdbcStudentDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /*
    Student profile is created upon new account creation
    TODO: createProfile (finish it with parameters)
     */
    @Override
    public boolean createProfile(int userId) {
        return true;
    }

    /*
    Student should have the ability to update information in their profiles
    TODO: updateProfileSummary,
    TODO: updateAcademicExperience,
    TODO: updateCareerExperience,
    TODO: updateSoftSkills,
    TODO: updateContactPreferences,
    TODO: updateInterests
    */


    /*
    Student can publish their profile when ready. The idea is the student will have a button to select
    if the profile is ready to be published. If that is selected, this method will be called to update in the is_published
    status appropriately (false if private, true if public) for the profile connected to a specific user_id
     */
    @Override
    public void updateIsPublished(boolean isPublished, int userId) {
        String sql = "UPDATE profile SET is_published = ? WHERE user_id = ?;";
        jdbcTemplate.update(sql, isPublished, userId);
    }

    //Users should be able to browse students by cohort number
    @Override
    public List<Student> getStudentsByCohortId(int cohortId) {
        List<Student> studentsByCohortId = new ArrayList<>();
        String sql = "SELECT * FROM profile WHERE cohort_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, cohortId);
        while(results.next()) {
            Student student = mapRowToStudent(results);
            studentsByCohortId.add(student);
        }
        return studentsByCohortId;
    }

    //Users should be able to view all students with published profiles
    @Override
    public List<Student> getAllStudents() {
        List<Student> allPublishedStudents = new ArrayList<>();
        String sql = "SELECT * FROM profile WHERE is_published = true;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()) {
            Student student = mapRowToStudent(results);
            allPublishedStudents.add(student);
        }
        return allPublishedStudents;
    }

    /*
    Individual student profiles should be retrieved when selected
    TODO: Distinguish if we want to use via ProfileId or UserId in API to view profile
     */
    @Override
    public Student getStudentByProfileId(int profileId) {
        String sql = "SELECT * FROM profile WHERE profile_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, profileId);
        if(results.next()) {
            return mapRowToStudent(results);
        } else {
            throw new RuntimeException("Profile was not found.");
        }
    }

    @Override
    public Student getStudentByUserId(int userId) {
        String sql = "SELECT * FROM profile WHERE user_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, userId);
        if(results.next()) {
            return mapRowToStudent(results);
        } else {
            throw new RuntimeException("Profile was not found.");
        }
    }


    //Staff may be able to see student profiles if not published
    @Override
    public List<Student> getUnpublishedProfiles() {
        List<Student> allPublishedStudents = new ArrayList<>();
        String sql = "SELECT * FROM profile WHERE is_published = false;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()) {
            Student student = mapRowToStudent(results);
            allPublishedStudents.add(student);
        }
        return allPublishedStudents;
    }

    /*
    Student profile should be searchable by cohortId (see above getStudentsByCohortId),
    highest degree obtained, prior industry experience, and technologies used:
    TODO: getStudentsByDegree,
    TODO: getStudentsByIndustry,
    TODO: searchStudentsByTechUsed
    */


    //IMPORTANT: TODO: DOUBLE CHECK ACCURACY IN NAMES & DATA TYPES WHEN DANIEL FINISHES DB
    private Student mapRowToStudent(SqlRowSet rs) {
        Student student = new Student();
        student.setUserId(rs.getInt("user_id"));
        student.setProfileId(rs.getInt("profile_id"));
        student.setCohortId(rs.getInt("cohort_id"));
        student.setFirstName(rs.getString("first_name"));
        student.setLastName(rs.getString("last_name"));
        student.setSummary(rs.getString("summary"));
        student.setSoftSkills(rs.getString("soft_skills"));
        student.setContactPreferences(rs.getString("contact_preferences"));
        student.setTechInterests(rs.getString("tech_interests"));
        student.setPublished(rs.getBoolean("is_published"));
        return student;
    }


}
