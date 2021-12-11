package com.techelevator.dao;

import com.techelevator.model.Degree;
import com.techelevator.model.Project;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcProjectDao implements ProjectDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcProjectDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void createProject(Project newProject) {
        String sql = "INSERT INTO projects (user_id, title, description, is_solo, technologies, link)" +
                "VALUES (?, ?, ?, ?, ?, ?);";
        jdbcTemplate.update(sql, newProject.getUserId(), newProject.getTitle(), newProject.getDescription(),
                newProject.isSolo(), newProject.getTechnologies(), newProject.getLink());
    }

    @Override
    public List<Project> getProjectsByUserId(int userId) {
        List<Project> allProjectsByStudent = new ArrayList<>();
        String sql = "SELECT * FROM projects WHERE user_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, userId);

        while(results.next()) {
            Project project = mapRowToProject(results);
            allProjectsByStudent.add(project);
        }
        return allProjectsByStudent;
    }

    //Students can update the various aspects of their projects as needed
    @Override
    public void updateTitle(Project updatedProject) {
        String sql = "UPDATE projects SET title = ? WHERE user_id = ?;";
        jdbcTemplate.update(sql, updatedProject.getTitle(), updatedProject.getUserId());
    }

    @Override
    public void updateDescription(Project updatedProject) {
        String sql = "UPDATE projects SET description = ? WHERE user_id = ?;";
        jdbcTemplate.update(sql, updatedProject.getDescription(), updatedProject.getUserId());
    }

    @Override
    public void updateIsSolo(Project updatedProject) {
        String sql = "UPDATE projects SET isSolo = ? WHERE user_id = ?;";
        jdbcTemplate.update(sql, updatedProject.isSolo(), updatedProject.getUserId());
    }

    @Override
    public void updateTechnologies(Project updatedProject) {
        String sql = "UPDATE projects SET technologies = ? WHERE user_id = ?;";
        jdbcTemplate.update(sql, updatedProject.getTechnologies(), updatedProject.getUserId());
    }

    @Override
    public void updateLink(Project updatedProject) {
        String sql = "UPDATE projects SET link = ? WHERE user_id = ?;";
        jdbcTemplate.update(sql, updatedProject.getLink(), updatedProject.getUserId());
    }

    //Students can delete projects as needed
    @Override
    public void deleteProject(int projectId, int userId) {
        String sql = "DELETE FROM projects WHERE project_id = ? AND user_id = ?;";
        jdbcTemplate.update(sql, projectId, userId);
    }

    private Project mapRowToProject(SqlRowSet rs) {
        Project project = new Project();
        project.setProjectId(rs.getInt("project_id"));
        project.setUserId(rs.getInt("user_id"));
        project.setTitle(rs.getString("title"));
        project.setDescription(rs.getString("description"));
        project.setSolo(rs.getBoolean("isSolo"));
        project.setTechnologies(rs.getString("technologies"));
        project.setLink(rs.getString("link"));
        return project;
    }

}
