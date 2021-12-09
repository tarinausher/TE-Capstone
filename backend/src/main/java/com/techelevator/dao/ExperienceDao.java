package com.techelevator.dao;

import com.techelevator.model.Experience;

import java.util.List;

public interface ExperienceDao {

    void createExperience(Experience experience);

    List<Experience> getExperiencesByUserId(int userId);

    void updateIndustry(Experience updatedExperience);
    void updateTitle(Experience updatedExperience);
    void updateOrganization(Experience updatedExperience);
    void updateDateStarted(Experience updatedExperience);
    void updateDateEnded(Experience updatedExperience);

    void deleteExperience(int experienceId, int userId);
}
