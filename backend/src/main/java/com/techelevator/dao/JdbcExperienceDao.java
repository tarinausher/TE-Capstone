package com.techelevator.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcExperienceDao implements ExperienceDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcExperienceDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


}
