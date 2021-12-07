package com.techelevator.controller;

import com.techelevator.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    // Example: /student?searchType=degree&searchQuery=bachelors&nameOrLastUpdated=last-updated
    // returns all Students satisfying highestDegreeObtained == "bachelors" sorted by which profile was last updated

    // Search types: cohort, highest-degree-obtained, prior-experience, technologies
    //
    @RequestMapping(path = "/student", method = RequestMethod.GET)
    public List<Student> list(@RequestParam(required = false) String searchType,
                              @RequestParam(required = false) String searchQuery,
                              @RequestParam(required = false) String nameOrLastUpdated) {
        return new ArrayList<Student>();
    }

    @RequestMapping(path = "/student/{studentId}", method = RequestMethod.GET)
    public Student list(@PathVariable int studentId) {
        return new Student();
    }
}
