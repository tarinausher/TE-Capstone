package com.techelevator.controller;

import com.techelevator.dao.DegreeDao;
import com.techelevator.model.Degree;
import org.springframework.web.bind.annotation.*;

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
    void addDegree(Degree degree) {
        degreeDao.createDegree(degree);
    }

    @DeleteMapping(path = "/degree")
    void deleteDegree(int degreeId, int userId) {
        degreeDao.deleteDegree(degreeId, userId);
    }
}
