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

    }

    @Override
    public void createProfile(Student newStudent) {
    }

    @Override
    public void updateFirstName(Student updatedStudent) {

    }

    @Override
    public void updateLastName(Student updatedStudent) {

    }

    @Override
    public void updateProfileSummary(Student updatedStudent) {

    }

    @Override
    public void updateTechnologies(Student updatedStudent) {

    }

    @Override
    public void updateSoftSkills(Student updatedStudent) {

    }

    @Override
    public void updateContactPreferences(Student updatedStudent) {

    }

    @Override
    public void updateIsPublished(Student updatedStudent) {

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
    public Student getStudentByUserId(int userId) {
        return null;
    }

    @Override
    public List<Student> getUnpublishedProfiles() {
        return null;
    }
}
