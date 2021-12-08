package com.techelevator.dao;

import com.techelevator.model.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MemoryStudentDao implements StudentDao {
    public static List<Student> students = new ArrayList<>();

    public MemoryStudentDao() {
        if (students.size() == 0) {
            System.out.println("here");
            setStudents();
        }
    }

    private void setStudents() {
        Student
    }

    @Override
    public boolean createProfile(int userId) {
        return false;
    }

    @Override
    public List<Student> getStudentsByCohortId(int cohortId) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public Student getStudentByProfileId(int profileId) {
        return null;
    }

    @Override
    public Student getStudentByUserId(int userId) {
        return null;
    }

    @Override
    public List<Student> getUnpublishedProfiles() {
        return null;
    }
}
