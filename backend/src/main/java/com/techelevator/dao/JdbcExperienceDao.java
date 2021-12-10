package com.techelevator.dao;

import com.techelevator.model.Degree;
import com.techelevator.model.Experience;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcExperienceDao implements ExperienceDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcExperienceDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void createExperience(Experience newExperience) {
        String sql = "INSERT INTO experiences (industry, title, organization, date_started, " +
                "date_ended, description, user_id)" +
                "VALUES (?, ?, ?, ?, ?);";
        jdbcTemplate.update(sql, newExperience.getIndustry(), newExperience.getTitle(),
                newExperience.getOrganization(), newExperience.getDateStarted(), newExperience.getDateEnded(),
                newExperience.getDescription(), newExperience.getUserId());
    }

    @Override
    public List<Experience> getExperiencesByUserId(int userId) {
        List<Experience> allExperiencesByStudent = new ArrayList<>();
        String sql = "SELECT * FROM experiences WHERE user_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, userId);

        while(results.next()) {
            Experience experience = mapRowToExperience(results);
            allExperiencesByStudent.add(experience);
        }
        return allExperiencesByStudent;
    }

    //Students can update their past employment experiences
    @Override
    public void updateIndustry(Experience updatedExperience) {
        String sql = "UPDATE degrees SET industry = ? WHERE = user_id = ?;";
        jdbcTemplate.update(sql, updatedExperience.getIndustry(), updatedExperience.getUserId());
    }

    @Override
    public void updateTitle(Experience updatedExperience) {
        String sql = "UPDATE degrees SET title = ? WHERE = user_id = ?;";
        jdbcTemplate.update(sql, updatedExperience.getTitle(), updatedExperience.getUserId());
    }

    @Override
    public void updateOrganization(Experience updatedExperience) {
        String sql = "UPDATE degrees SET organization = ? WHERE = user_id = ?;";
        jdbcTemplate.update(sql, updatedExperience.getOrganization(), updatedExperience.getUserId());
    }

    @Override
    public void updateDateStarted(Experience updatedExperience) {
        String sql = "UPDATE degrees SET date_started = ? WHERE = user_id = ?;";
        jdbcTemplate.update(sql, updatedExperience.getDateStarted(), updatedExperience.getUserId());
    }

    @Override
    public void updateDateEnded(Experience updatedExperience) {
        String sql = "UPDATE degrees SET date_ended = ? WHERE = user_id = ?;";
        jdbcTemplate.update(sql, updatedExperience.getDateEnded(), updatedExperience.getUserId());
    }

    //Students can delete certain employment experiences as needed
    @Override
    public void deleteExperience(int experienceId, int userId) {
        String sql = "DELETE FROM experiences WHERE experience_id = ? AND user_id = ?;";
        jdbcTemplate.update(sql, experienceId, userId);
    }

    private Experience mapRowToExperience(SqlRowSet rs) {
        Experience experience = new Experience();
        experience.setExperienceId(rs.getInt("experience_id"));
        experience.setUserId(rs.getInt("user_id"));
        experience.setIndustry(rs.getString("industry"));
        experience.setTitle(rs.getString("title"));
        experience.setOrganization(rs.getString("organization"));
        experience.setDateStarted(rs.getString("date_started"));
        experience.setDateEnded(rs.getString("date_ended"));
        experience.setDescription(rs.getString("description"));
        return experience;
    }

}
