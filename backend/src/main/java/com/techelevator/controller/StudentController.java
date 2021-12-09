package com.techelevator.controller;

import com.techelevator.dao.JdbcStudentDao;
import com.techelevator.dao.StudentDao;
import com.techelevator.model.Degree;
import com.techelevator.model.Experience;
import com.techelevator.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@RestController
public class StudentController {

    private StudentDao studentDao;

    public StudentController(StudentDao studentDao) {
        this.studentDao = this.studentDao = studentDao;
    }

    // Example 1: /student returns all Students
    // Example 2: /student?searchType=degree&searchQuery=bachelors&nameOrLastUpdated=last-updated
    // returns all Students satisfying highestDegreeObtained == "bachelors" sorted by which profile was last updated

    // Search types: cohort, highest-degree-obtained, experience, technologies
    // cohort must be exact cohortId
    // highest-degree-obtained must be an exact match
    // experience must be an exact match
    // with technologies the method checks for whether searchQuery is contained in the technology field
    @RequestMapping(path = "/student", method = RequestMethod.GET)
    public List<Student> list(@RequestParam(required = false) String searchType,
                              @RequestParam(required = false) String searchQuery,
                              @RequestParam(required = false) String nameOrLastUpdated) {

        List<Student> students = studentDao.getAllStudents();

        if(searchType == null) {
            return students;
        }

        List<Student> filteredStudents = new ArrayList<>();

        switch(searchType) {
            case "cohort":
                for(Student student : students) {
                    if(student.getCohort().getCohortId() == Integer.parseInt(searchQuery)) {
                        filteredStudents.add(student);
                    }
                }
                break;
            case "highest-degree-obtained":
                for(Student student : students) {
                    if(student.highestDegreeLevel().equals(searchQuery)) {
                        filteredStudents.add(student);
                    }
                }
                break;
            case "experience":
                for(Student student : students) {
                    List<Experience> experiences = student.getExperiences();
                    for(Experience experience : experiences) {
                        if(experience.getIndustry().equals(searchQuery)) {
                            filteredStudents.add(student);
                        }
                    }
                }
                break;
            case "technologies":
                for(Student student : students) {
                    if(student.getTechnologies().contains(searchQuery)) {
                        filteredStudents.add(student);
                    }
                }
        }

        if(nameOrLastUpdated != null) {
            if(nameOrLastUpdated.equals("name")) {
                Collections.sort(students, new Comparator<Student>() {
                    @Override
                    public int compare(Student student1, Student student2) {
                        String student1Name = student1.getFirstName() + student1.getLastName();
                        String student2Name = student2.getFirstName() + student2.getLastName();

                        return student1Name.compareTo(student2Name);
                    }
                });
            }
            else {
                Collections.sort(students, new Comparator<Student>() {
                    @Override
                    public int compare(Student student1, Student student2) {
                        return student2.getLastUpdated().compareTo(student1.getLastUpdated());
                    }
                });
            }
        }

        return filteredStudents;
    }

    @RequestMapping(path = "/student/{studentId}", method = RequestMethod.GET)
    public Student list(@PathVariable int studentId) {
        return new Student();
    }
}
