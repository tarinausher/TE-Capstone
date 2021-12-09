package com.techelevator.dao;

import com.techelevator.model.Degree;
import com.techelevator.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.ArrayList;
import java.util.List;

public class JdbcDegreeDao implements DegreeDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcDegreeDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Degree> getDegreesByUserId(int userId) {
        List<Degree> allDegreesByStudent = new ArrayList<>();
        String sql = "SELECT * FROM degrees WHERE user_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

        while(results.next()) {
            Degree degree = mapRowToDegree(results);
            allDegreesByStudent.add(degree);
        }
        return allDegreesByStudent;
    }

    private Degree mapRowToDegree(SqlRowSet rs) {
        Degree degree = new Degree();
        degree.setDegreeId(rs.getInt("degree_id"));
        degree.setUserId(rs.getInt("user_id"));
        degree.setLevel(rs.getString("level"));
        degree.setInstitution(rs.getString("institution"));
        degree.setSubjectArea(rs.getString("subject_area"));
        degree.setDateCompleted(rs.getString("date_completed"));
        return degree;
    }
}
