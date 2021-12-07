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
    };

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
    Student can publish their profile when ready
    TODO: updateIsPublished
     */


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

    /*
    Users should be able to view all students with published profiles
    TODO: viewAllStudents
     */

    /*
    Individual student profiles should be retrieved when selected
    TODO: viewStudentByProfileId OR viewStudentByUserId
     */

    /*
    Staff may be able to see student profiles if not published
    TODO: viewUnpublishedProfiles
     */

    /*
    Student profile should be searchable by cohortId, highest degree obtained, prior industry experience, and technologies used:
    TODO: searchStudentsByCohortID,
    TODO: searchStudentsByDegree,
    TODO: searchStudentsByIndustry,
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
