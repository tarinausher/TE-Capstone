package com.techelevator.dao;

import com.techelevator.model.Degree;
import com.techelevator.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcDegreeDao implements DegreeDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcDegreeDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void createDegree(Degree newDegree) {
        String sql = "INSERT INTO degrees (user_id, level, institution, subject_area, date_completed)" +
            "VALUES (?, ?, ?, ?, ?);";
        jdbcTemplate.update(sql, newDegree.getUserId(), newDegree.getLevel(), newDegree.getInstitution(),
                newDegree.getSubjectArea(), newDegree.getDateCompleted());
    }

    @Override
    public List<Degree> getDegreesByUserId(int userId) {
        List<Degree> allDegreesByStudent = new ArrayList<>();
        String sql = "SELECT * FROM degrees WHERE user_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, userId);

        while(results.next()) {
            Degree degree = mapRowToDegree(results);
            allDegreesByStudent.add(degree);
        }

        return allDegreesByStudent;
    }

    //Students can update their degree levels, institution, subject area, and date completed
    @Override
    public void updateDegreeLevel(Degree updatedDegree) {
        String sql = "UPDATE degrees SET level = ? WHERE user_id = ?;";
        jdbcTemplate.update(sql, updatedDegree.getLevel(), updatedDegree.getUserId());
    }

    @Override
    public void updateDegreeInstitution(Degree updatedDegree) {
        String sql = "UPDATE degrees SET institution = ? WHERE user_id = ?;";
        jdbcTemplate.update(sql, updatedDegree.getInstitution(), updatedDegree.getUserId());
    }

    @Override
    public void updateDegreeSubjectArea(Degree updatedDegree) {
        String sql = "UPDATE degrees SET subject_area = ? WHERE user_id = ?;";
        jdbcTemplate.update(sql, updatedDegree.getSubjectArea(), updatedDegree.getUserId());
    }

    @Override
    public void updateDegreeDateCompleted(Degree updatedDegree) {
        String sql = "UPDATE degrees SET date_completed = ? WHERE user_id = ?;";
        jdbcTemplate.update(sql, updatedDegree.getDateCompleted(), updatedDegree.getUserId());
    }

    //Students can delete certain degrees as needed
    @Override
    public void deleteDegree(int degreeId) {
        String sql = "DELETE FROM degrees WHERE degree_id = ?;";
        jdbcTemplate.update(sql, degreeId);
    }

    private Degree mapRowToDegree(SqlRowSet rs) {
        Degree degree = new Degree();
        degree.setDegreeId(rs.getInt("degree_id"));
        degree.setUserId(rs.getInt("user_id"));
        degree.setLevel(rs.getString("level"));
        degree.setInstitution(rs.getString("institution"));
        degree.setSubjectArea(rs.getString("subject_area"));
        degree.setDateCompleted(rs.getDate("date_completed").toLocalDate());
        return degree;
    }
}
