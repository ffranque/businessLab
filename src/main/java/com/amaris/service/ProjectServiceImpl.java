package com.amaris.service;

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

}
