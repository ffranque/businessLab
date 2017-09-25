package com.amaris.service;

import java.util.Date;
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

	List<Project> findAllNames();

	List<Project> findAllProjectManagers();

	List<Project> findAllForcastedEndDates();

	List<Project> findAllTypes();
	
	List<Project> findAllClientNames();

	void updateProjectConsultant(Consultant consultant, Long id);

	void updateName(String name, Long id);

	void updateType(String type, Long id);

	void updateClientName(String clientName, Long id);

	void updateProjectManager(String projectManager, Long id);

	void updateSector(String sector, Long id);

	void updateBeginningDate(Date beginningDate, Long id);

	void updateEndDate(Date endDate, Long id);

	void updateForcastedEndDate(Date forcastedEndDate, Long id);
}
