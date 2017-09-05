package com.amaris.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amaris.model.Client;
import com.amaris.model.Consultant;
import com.amaris.model.Project;
import com.amaris.service.ClientService;
import com.amaris.service.ConsultantService;
import com.amaris.service.ProjectService;

@Controller
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private ConsultantService consultantService;
	
	@Autowired
	ClientService clientService;

	@RequestMapping(value="/projects")
	public String projects(Model model) {
		model.addAttribute("title", "Projects");
		model.addAttribute("project", new Project());
		model.addAttribute("clientNames", projectService.findAllClientsNames());
		model.addAttribute("projectList", projectService.findAll());
		return "projects";
	}
	
	@RequestMapping(value = "/addProject", method = RequestMethod.POST)
	public String addProject(@ModelAttribute("project") Project project) {
		
		Client client = clientService.findFirstByName(project.getClientName());
		project.setClient(client);
		projectService.save(project);
		
		return "redirect:projects.html";
	}
	
	@RequestMapping(value = "/addConsultant", method = RequestMethod.POST)
	public String addConsultant(@ModelAttribute("consultant") Consultant consultant, Long projectId, Model model) {
		
		consultantService.save(consultant);
		Consultant consultant2 = consultantService.findFirstByName(consultant.getName());
		projectService.updateProjectConsultant(consultant2, projectId);
		
		model.addAttribute("project", projectService.findById(projectId));
		
		return "redirect:projects.html";
	}
	
	@RequestMapping(value="/projectDetail", method = RequestMethod.GET)
	public String projectDetail(Model model, Long id) {
		
		model.addAttribute("title", "Project Detail");
		Project project = projectService.findById(id);
		model.addAttribute("project", project);
		model.addAttribute("consultant", new Consultant());
		
		return "projectDetail";
	}
}
