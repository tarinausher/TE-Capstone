package com.techelevator.dao;

import com.techelevator.model.Degree;

import java.util.List;

public interface DegreeDao  {

    void createDegree(Degree newDegree);

    List<Degree> getDegreesByUserId(int userId);

    //Students can update their degree levels, institution, subject area, and date completed
    void updateDegreeLevel(Degree updatedDegree);
    void updateDegreeInstitution(Degree updatedDegree);
    void updateDegreeSubjectArea(Degree updatedDegree);
    void updateDegreeDateCompleted(Degree updatedDegree);

    //Students can delete certain degrees as needed
    void deleteDegree(int degreeId, int userId);
}
