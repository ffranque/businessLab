package com.amaris.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amaris.model.Goal;
import com.amaris.model.GoalReport;
import com.amaris.repository.GoalRepository;

@Service("goalService")
public class GoalServiceImpl implements GoalService {
	
	@Autowired
	private GoalRepository goalRepository;

	@Transactional
	public Goal save(Goal goal) {
		return goalRepository.save(goal);
	}

	public List<Goal> findAllGoals() {
		return goalRepository.findAll();
	}

	public List<GoalReport> findAllGoalReports() {
		return goalRepository.findAllGoalReports();
	}

}
