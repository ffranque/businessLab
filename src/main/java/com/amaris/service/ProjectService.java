package com.amaris.service;

import java.util.List;

import com.amaris.model.Client;
import com.amaris.model.Consultant;
import com.amaris.model.Project;

public interface ProjectService {

	Project save(Project project);
	List<Project> findAll();
	Project findById(Long id);
	void remove(Long id);
	List<Client> findAllClientsNames();
	void updateProjectConsultant(Consultant consultant, Long id);
}
