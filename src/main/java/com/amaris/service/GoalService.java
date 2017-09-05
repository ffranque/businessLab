package com.amaris.service;

import java.util.List;

import com.amaris.model.Goal;
import com.amaris.model.GoalReport;

public interface GoalService {

	Goal save(Goal goal);

	List<Goal> findAllGoals();

	List<GoalReport> findAllGoalReports();
}
