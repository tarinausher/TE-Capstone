package com.techelevator.dao;

import com.techelevator.model.Student;
import com.techelevator.model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcStudentDaoTests extends FinalCapstoneDaoTests {

//    private static final Student student1 = new Student(1, 1, 10, "Test1", "Test1", "Test summary 1",
//            "listening, teamwork", "email", "java, sql, html", false);
//    private static final Student student2 = new Student(2, 2, 10, "Test2", "Test2", "Test summary 2",
//            "empathy, problem solving", "email", ".net, sql, springboot", true);
//    private static final Student student3 = new Student(3, 3, 9, "Test3", "Test3", "Test summary 3",
//            "leading, teamwork", "email", "java, python, frontend dev", false);
//    private static final Student student4 = new Student(4, 4, 9, "Test4", "Test4", "Test summary 4",
//            "crying, teamwork", "email", "java, python, frontend dev", true);
//
//    private JdbcStudentDao sut;
//
//    @Before
//    public void setup() {
//        DataSource dataSource = this.getDataSource();
//        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//        sut = new JdbcStudentDao(jdbcTemplate);
//    }
//    //TODO come back to the tests because this is going to waste time
//
//    @Test
//    public void updatePublishStatus() {
//        sut.updateIsPublished(student1);
//        Assert.assertTrue(student1.isPublished());
//    }
//
//    @Test
//    public void getStudentsByCohortId() {
//        List<Student> studentByCohort = new ArrayList<>();
//        studentByCohort.add(student1);
//        studentByCohort.add(student2);
//
//        List<Student> testList = sut.getStudentsByCohortId(10);
//
//        Assert.assertEquals(studentByCohort.size(), testList.size());
//        assertStudentMatch(student1, testList.get(0));
//    }
//
//
//    @Test
//    public void getAllStudentsWhoArePublished () {
//        List<Student> publishedStudents = new ArrayList<>();
//        publishedStudents.add(student2);
//        publishedStudents.add(student4);
//
//        List<Student> testList = sut.getAllStudents();
//
//        Assert.assertEquals(publishedStudents.size(), testList.size());
//        assertStudentMatch(student2, testList.get(0));
//        Assert.assertEquals(publishedStudents, testList);
//    }
//
//    @Test
//    public void getAllUnpublishedProfiles () {
//       List<Student> unpublishedStudents = new ArrayList<>();
//       unpublishedStudents.add(student1);
//       unpublishedStudents.add(student3);
//
//       List<Student> testList = sut.getUnpublishedProfiles();
//
//       Assert.assertEquals(unpublishedStudents.size(), testList.size());
////        assertStudentMatch(unpublishedStudent);
//       Assert.assertEquals(unpublishedStudents, testList);
//    }
//
//    @Test
//    public void getStudentByProfileId () {
//        Student testStudent = sut.getStudentByProfileId(1);
//
//        Assert.assertEquals(student1, testStudent);
//    }
//
//    @Test
//    public void getStudentByUserId () {
//        Student testStudent = sut.getStudentByUserId(2);
//
//        Assert.assertEquals(student2.getFirstName(), testStudent.getFirstName());
//    }
//
//    private void assertStudentMatch (Student expected, Student actual){
//        Assert.assertEquals(expected.getUserId(), actual.getUserId());
//        Assert.assertEquals(expected.getProfileId(), actual.getProfileId());
//        Assert.assertEquals(expected.getCohortId(), actual.getCohortId());
//        Assert.assertEquals(expected.getFirstName(), actual.getFirstName());
//        Assert.assertEquals(expected.getLastName(), actual.getLastName());
//        Assert.assertEquals(expected.getSummary(), actual.getSummary());
//        Assert.assertEquals(expected.getContactPreferences(), actual.getContactPreferences());
//        Assert.assertEquals(expected.getTechInterests(), actual.getTechInterests());
//        Assert.assertEquals(expected.isPublished(), actual.isPublished());
//    }
}

