package com.techelevator.dao;

import com.techelevator.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcStudentDao implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcStudentDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    //Student profile is created upon new account creation
    @Override
    public void createProfile(Student newStudent) {
        String sql = "INSERT INTO students (user_id, first_name, last_name, summary, technologies, soft_skills, " +
                "contact_preferences, is_pubished)" +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, newStudent.getUserId(), newStudent.getFirstName(), newStudent.getLastName(),
                newStudent.getSummary(), newStudent.getTechnologies(), newStudent.getSoftSkills(),
                newStudent.getContactPreferences(), newStudent.isPublished());
    }

    /*
    Student should have the ability to update information in their profiles
    TODO: updateAcademicExperience --> to be done in Degree DAO
    TODO: updateCareerExperience --> to be done in Experience DAO
    */
    @Override
    public void updateFirstName(Student updatedStudent) {
        String sql = "UPDATE students SET first_name = ? WHERE user_id = ?;";
        jdbcTemplate.update(sql, updatedStudent.getFirstName(), updatedStudent.getUserId());
    }

    @Override
    public void updateLastName(Student updatedStudent) {
        String sql = "UPDATE students SET last_name = ? WHERE user_id = ?;";
        jdbcTemplate.update(sql, updatedStudent.getLastName(), updatedStudent.getUserId());
    }

    @Override
    public void updateProfileSummary(Student updatedStudent) {
        String sql = "UPDATE students SET summary = ? WHERE user_id = ?;";
        jdbcTemplate.update(sql, updatedStudent.getSummary(), updatedStudent.getUserId());
    }

    @Override
    public void updateTechnologies(Student updatedStudent) {
        String sql = "UPDATE students SET technologies = ? WHERE user_id = ?;";
        jdbcTemplate.update(sql, updatedStudent.getTechnologies(), updatedStudent.getUserId());
    }

    @Override
    public void updateSoftSkills(Student updatedStudent) {
        String sql = "UPDATE students SET soft_skills = ? WHERE user_id = ?;";
        jdbcTemplate.update(sql, updatedStudent.getSoftSkills(), updatedStudent.getUserId());
    }

    @Override
    public void updateContactPreferences(Student updatedStudent) {
        String sql = "UPDATE students SET contact_preferences = ? WHERE user_id = ?;";
        jdbcTemplate.update(sql, updatedStudent.getContactPreferences(), updatedStudent.getUserId());
    }

    /*
    Student can publish their profile when ready. The idea is the student will have a button to select
    if the profile is ready to be published. If that is selected, this method will be called to update in the is_published
    status appropriately (false if private, true if public) for the profile connected to a specific user_id
     */
    @Override
    public void updateIsPublished(Student updatedStudent) {
        String sql = "UPDATE students SET is_published = ? WHERE user_id = ?;";
        jdbcTemplate.update(sql, !updatedStudent.isPublished(), updatedStudent.getUserId());
    }

    //Users should be able to browse students by cohort number
    @Override
    public List<Student> getStudentsByCohortId(int cohortId) {
        List<Student> studentsByCohortId = new ArrayList<>();
        String sql = "SELECT * FROM students WHERE cohort_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, cohortId);
        while (results.next()) {
            Student student = mapRowToStudent(results);
            studentsByCohortId.add(student);
        }
        return studentsByCohortId;
    }

    //Users should be able to view all students with published profiles
    @Override
    public List<Student> getAllStudents() {
        List<Student> getAllPublishedStudents = new ArrayList<>();

        String sql = "SELECT * FROM students WHERE is_published = true;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()) {
            Student student = mapRowToStudent(results);

            getAllPublishedStudents.add(student);
        }
        return getAllPublishedStudents;
    }


    //Individual student profiles should be retrieved when selected
    @Override
    public Student getStudentByUserId(int userId) {
        String sql = "SELECT * FROM students WHERE user_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, userId);
        if (results.next()) {
            return mapRowToStudent(results);
        } else {
            throw new RuntimeException("Profile was not found.");
        }
    }

    //Staff may be able to see student profiles if not published
    @Override
    public List<Student> getUnpublishedProfiles() {
        List<Student> allPublishedStudents = new ArrayList<>();
        String sql = "SELECT * FROM students WHERE is_published = false;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()) {
            Student student = mapRowToStudent(results);
            allPublishedStudents.add(student);
        }
        return allPublishedStudents;
    }

    /*
    TODO: Determine if these methods are needed based on API
    Student profile should be searchable by cohortId (see above getStudentsByCohortId),
    highest degree obtained, prior industry experience, and technologies used:
    getStudentsByDegree,
    getStudentsByIndustry,
    searchStudentsByTechUsed
    */

    private Student mapRowToStudent(SqlRowSet rs) {
        Student student = new Student();
        student.setUserId(rs.getInt("user_id"));
        student.setCohortId(rs.getInt("cohort_id"));
        student.setFirstName(rs.getString("first_name"));
        student.setLastName(rs.getString("last_name"));
        student.setSummary(rs.getString("summary"));
        student.setTechnologies(rs.getString("technologies"));
        student.setSoftSkills(rs.getString("soft_skills"));
        student.setPublished(rs.getBoolean("is_published"));
        student.setLastUpdated(rs.getString("last_updated"));
        return student;
    }
}
