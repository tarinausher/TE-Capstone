package com.techelevator.dao;

import com.techelevator.model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class JdbcStudentDaoTests extends FinalCapstoneDaoTests {

    private JdbcStudentDao sut;

//    @Before
//    public void setup() {
//        DataSource dataSource = this.getDataSource();
//        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//        sut = new JdbcStudentDao(jdbcTemplate);
//    }
//
//    @Test
//    public void createStudent() {
//        boolean studentCreated = sut.create()
//        boolean userCreated = sut.create("TEST_USER","test_password","email@email.com", "user");
//        Assert.assertTrue(userCreated);
//        User user = sut.findByUsername("TEST_USER");
//        Assert.assertEquals("TEST_USER", user.getUsername());
//    }

}
