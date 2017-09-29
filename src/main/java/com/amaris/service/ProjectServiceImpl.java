package com.amaris.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amaris.model.Client;
import com.amaris.model.Consultant;
import com.amaris.model.Project;
import com.amaris.repository.ProjectRepository;

@Service("projectService")
@Transactional
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepository projectRepository;

	public Project save(Project project) {
		return projectRepository.saveAndFlush(project);
	}

	public List<Project> findAll() {
		return projectRepository.findAll();
	}

	public Project findById(Long id) {
		return projectRepository.findOne(id);
	}

	public void remove(Long id) {
		projectRepository.delete(id);
	}

	public List<Client> findAllClientsNames() {
		return projectRepository.findAllClientsNames();
	}

	public void updateProjectConsultant(Consultant consultant, Long id) {
		projectRepository.updateProjectConsultant(consultant, id);
	}

	public void updateName(String name, Long id) {
		projectRepository.updateName(name, id);
	}

	public void updateType(String type, Long id) {
		projectRepository.updateType(type, id);
	}

	public void updateClientName(String clientName, Long id) {
		projectRepository.updateClientName(clientName, id);
	}

	public void updateProjectManager(String projectManager, Long id) {
		projectRepository.updateProjectManager(projectManager, id);
	}

	public void updateSector(String sector, Long id) {
		projectRepository.updateSector(sector, id);
	}

	public void updateBeginningDate(Date beginningDate, Long id) {
		projectRepository.updateBeginningDate(beginningDate, id);
	}

	public void updateEndDate(Date endDate, Long id) {
		projectRepository.updateEndDate(endDate, id);
	}

	public void updateForcastedEndDate(Date forcastedEndDate, Long id) {
		projectRepository.updateForcastedEndDate(forcastedEndDate, id);
	}

	public List<Project> findAllNames() {
		return projectRepository.findAllNames();
	}

	public List<Project> findAllProjectManagers() {
		return projectRepository.findAllProjectManagers();
	}

	public List<Project> findAllForcastedEndDates() {
		return projectRepository.findAllForcastedEndDates();
	}

	public List<Project> findAllTypes() {
		return projectRepository.findAllTypes();
	}

	public List<Project> findAllClientNames() {
		return projectRepository.findAllClientNames();
	}

	public List<Project> searchProject(String group, String query) throws ParseException {
		List<Project> projects = null;
		
		if (group.equalsIgnoreCase("name")) {
			projects = projectRepository.findByNameIgnoreCaseContaining(query);
		} else if (group.equalsIgnoreCase("project-manager")) {
			projects = projectRepository.findByProjectManagerIgnoreCaseContaining(query);
		} else if (group.equalsIgnoreCase("type")) {
			projects = projectRepository.findByTypeIgnoreCaseContaining(query);
		} else if (group.equalsIgnoreCase("fed")) {
			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			Date date = formatter.parse(query);
			projects = projectRepository.findByForcastedEndDateContaining(date);
		} else if (group.equalsIgnoreCase("client")) {
			projects = projectRepository.findByClientNameIgnoreCaseContaining(query);
		}

		return projects;
	}

}
