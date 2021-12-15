package com.techelevator.controller;

import com.techelevator.dao.ExperienceDao;
import com.techelevator.model.Experience;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ExperienceController {
    private ExperienceDao experienceDao;

    public ExperienceController(ExperienceDao experienceDao) {
        this.experienceDao = experienceDao;
    }

    @PostMapping(path = "/experience")
    @ResponseStatus(HttpStatus.CREATED)
    public void createExperience(@RequestBody Experience experience) {
        experienceDao.createExperience(experience);
    }

    @PutMapping(path = "/experience/industry")
    public void updateIndustry(Experience updatedExperience) {
        experienceDao.updateIndustry(updatedExperience);
    }

    @PutMapping(path = "/experience/title")
    public void updateTitle(Experience updatedExperience) {
        experienceDao.updateTitle(updatedExperience);
    }

    @PutMapping(path = "/experience/organization")
    public void updateOrganization(Experience updatedExperience) {
        experienceDao.updateOrganization(updatedExperience);
    }

    @PutMapping(path = "/experience/date-started")
    public void updateDateStarted(Experience updatedExperience) {
        experienceDao.updateDateStarted(updatedExperience);
    }

    @PutMapping(path = "/experience/date-ended")
    public void updateDateEnded(Experience updatedExperience) {
        experienceDao.updateDateEnded(updatedExperience);
    }

    @DeleteMapping(path = "/experience")
    public void deleteExperience(int experienceId, int userId) {
        experienceDao.deleteExperience(experienceId, userId);
    }
}
