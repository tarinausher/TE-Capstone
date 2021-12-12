package com.techelevator.controller;

import com.techelevator.dao.*;
import com.techelevator.model.Degree;
import com.techelevator.model.Experience;
import com.techelevator.model.Project;
import com.techelevator.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class StudentController {
    private StudentDao studentDao;
    private DegreeDao degreeDao;
    private ExperienceDao experienceDao;
    private ProjectDao projectDao;

    public StudentController(StudentDao studentDao, DegreeDao degreeDao, ExperienceDao experienceDao, ProjectDao projectDao) {
        this.studentDao = studentDao;
        this.degreeDao = degreeDao;
        this.experienceDao = experienceDao;
        this.projectDao = projectDao;
    }

    @GetMapping(path = "/student")
    public List<Student> students() {
        List<Student> students = studentDao.getAllStudents();
        addDegreesExperiencesProjects(students);

        return students;
    }

    @GetMapping(path = "/student/{userId}")
    public Student studentByUserId(@PathVariable int userId) {
        Student student = studentDao.getStudentByUserId(userId);
        List<Student> students = new ArrayList<>();
        students.add(student);
        addDegreesExperiencesProjects(students);

        return student;
    }

    @GetMapping(path = "/student/{userId}/degrees")
    public List<Degree> degreesByUserId(@PathVariable int userId) {
        return degreeDao.getDegreesByUserId(userId);
    }

    @GetMapping(path = "/student/{userId}/experiences")
    public List<Experience> experiencesByUserId(@PathVariable int userId) {
        return experienceDao.getExperiencesByUserId(userId);
    }

    @GetMapping(path = "/student/{userId}/projects")
    public List<Project> projectsByUserId(@PathVariable int userId) {
        return projectDao.getProjectsByUserId(userId);
    }

    @GetMapping(path = "/student/cohort/{cohortId}") // /cohort/{cohortId}/student
    public List<Student> studentByCohortId(@PathVariable int cohortId) {
        List<Student> students = studentDao.getStudentsByCohortId(cohortId);
        addDegreesExperiencesProjects(students);

        return students;
    }

    @GetMapping(path = "/student/degree/{level}")
    public List<Student> studentByHighestDegreeLevel(@PathVariable String level) {
        List<Student> students = studentDao.getAllStudents();
        addDegrees(students);

        List<Student> filteredStudents = new ArrayList<>();
        for(Student student : students) {
            if(student.highestDegreeLevel().equals(level)) {
                filteredStudents.add(student);
            }
        }

        addExperiences(filteredStudents);
        addProjects(filteredStudents);

        return filteredStudents;
    }

    @GetMapping(path = "/student/experience/{industry}")
    public List<Student> studentByIndustry(@PathVariable String industry) {
        List<Student> students = studentDao.getAllStudents();
        addExperiences(students);

        List<Student> filteredStudents = new ArrayList<>();
        for(Student student : students) {
            List<Experience> experiences = student.getExperiences();
            for(Experience experience : experiences) {
                if(experience.getIndustry().equals(industry)) {
                    filteredStudents.add(student);
                }
            }
        }

        addDegrees(filteredStudents);
        addProjects(filteredStudents);

        return filteredStudents;
    }

    @GetMapping(path = "/student/technology/{technologies}")
    public List<Student> studentByTechnology(@PathVariable String technologies) {
        List<Student> students = studentDao.getAllStudents();

        List<Student> filteredStudents = new ArrayList<>();
        for(Student student : students) {
            if(student.getTechnologies().contains(technologies)) {
                filteredStudents.add(student);
            }
        }

        addDegreesExperiencesProjects(students);

        return filteredStudents;
    }

    private void addDegreesExperiencesProjects(List<Student> students) {
        addDegrees(students);
        addExperiences(students);
        addProjects(students);
    }

    private void addDegrees(List<Student> students) {
        for(Student student : students) {
            student.setDegrees(degreeDao.getDegreesByUserId(student.getUserId()));
        }
    }

    private void addExperiences(List<Student> students) {
        for(Student student : students) {
            student.setExperiences(experienceDao.getExperiencesByUserId(student.getUserId()));
        }
    }

    private void addProjects(List<Student> students) {
        for(Student student : students) {
            student.setProjects(projectDao.getProjectsByUserId(student.getUserId()));
        }
    }
}
