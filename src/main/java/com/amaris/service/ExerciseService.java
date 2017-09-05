package com.amaris.service;

import java.util.List;

import com.amaris.model.Activity;
import com.amaris.model.Exercise;

public interface ExerciseService {

	List<Activity> findAllActivities();

	Exercise save(Exercise exercise);

}