package com.techelevator.controller;

import com.techelevator.dao.DegreeDao;
import com.techelevator.model.Degree;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin
public class DegreeController {
    private DegreeDao degreeDao;

    public DegreeController(DegreeDao degreeDao) {
        this.degreeDao = degreeDao;
    }

    @PutMapping(path = "/degree/level")
    void updateLevel(Degree updatedDegree) {
        degreeDao.updateDegreeLevel(updatedDegree);
    }

    @PutMapping(path = "/degree/institution")
    void updateInstitution(Degree updatedDegree) {
        degreeDao.updateDegreeInstitution(updatedDegree);
    }

    @PutMapping(path = "/degree/area")
    void updateSubjectArea(Degree updatedDegree) {
        degreeDao.updateDegreeSubjectArea(updatedDegree);
    }

    @PutMapping(path = "/degree/date-completed")
    void updateDateCompleted(Degree updatedDegree) {
        degreeDao.updateDegreeDateCompleted(updatedDegree);
    }

    @PostMapping(path = "/degree")
    @ResponseStatus(HttpStatus.CREATED)
    void degree(Degree degree) {
        degreeDao.createDegree(degree);
    }

    @DeleteMapping(path = "/degree/{degreeId}")
    void deleteDegree(@PathVariable int degreeId) {
        degreeDao.deleteDegree(degreeId);
    }
}
