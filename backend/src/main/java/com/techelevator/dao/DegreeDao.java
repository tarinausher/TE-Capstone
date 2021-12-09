package com.techelevator.dao;

import com.techelevator.model.Degree;

import java.util.List;

public interface DegreeDao  {

    List<Degree> getDegreesByUserId(int userId);

}
