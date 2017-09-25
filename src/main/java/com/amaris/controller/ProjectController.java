package com.amaris.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.amaris.model.Client;
import com.amaris.model.Consultant;
import com.amaris.model.Project;
import com.amaris.service.ClientService;
import com.amaris.service.ConsultantService;
import com.amaris.service.ProjectService;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

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
	
	@RequestMapping(value = "/project/updateName", method = RequestMethod.POST)
	public @ResponseBody String editName(@RequestParam("value") String name, @RequestParam("pk") Long id) {
		projectService.updateName(name, id);
		System.out.println("Project Name Updated!");
		System.out.println(name + "--" + id);
		return "";
	}
	
	@RequestMapping(value = "/project/updateType", method = RequestMethod.POST)
	public @ResponseBody String editType(@RequestParam("value") String type, @RequestParam("pk") Long id) {
		projectService.updateType(type, id);
		System.out.println("Project type Updated!");
		System.out.println(type + "--" + id);
		return "";
	}
	
	@RequestMapping(value = "/project/updateClientName", method = RequestMethod.POST)
	public @ResponseBody String editClientName(@RequestParam("value") String clientName, @RequestParam("pk") Long id) {
		projectService.updateClientName(clientName, id);
		System.out.println("Project client Updated!");
		System.out.println(clientName + "--" + id);
		return "";
	}
	
	@RequestMapping(value = "/project/updateManager", method = RequestMethod.POST)
	public @ResponseBody String editManager(@RequestParam("value") String manager, @RequestParam("pk") Long id) {
		projectService.updateProjectManager(manager, id);
		System.out.println("Project manager Updated!");
		System.out.println(manager + "--" + id);
		return "";
	}
	
	@RequestMapping(value = "/project/updateSector", method = RequestMethod.POST)
	public @ResponseBody String editSector(@RequestParam("value") String sector, @RequestParam("pk") Long id) {
		projectService.updateSector(sector, id);
		System.out.println("Project sector Updated!");
		System.out.println(sector + "--" + id);
		return "";
	}
	
	@RequestMapping(value = "/project/updateBeginningDate", method = RequestMethod.POST)
	public @ResponseBody String editBeginningDate(@RequestParam("value") Date beginningDate, @RequestParam("pk") Long id) {
		projectService.updateBeginningDate(beginningDate, id);
		System.out.println("Project sector Updated!");
		System.out.println(beginningDate + "--" + id);
		return "";
	}
	
	@RequestMapping(value = "/project/updateEndDate", method = RequestMethod.POST)
	public @ResponseBody String editEndDate(@RequestParam("value") Date endDate, @RequestParam("pk") Long id) {
		projectService.updateEndDate(endDate, id);
		System.out.println("Project sector Updated!");
		System.out.println(endDate + "--" + id);
		return "";
	}
	
	@RequestMapping(value = "/project/updateForcastedEndDate", method = RequestMethod.POST)
	public @ResponseBody String editForcastedEndDate(@RequestParam("value") Date forcastedEndDate, @RequestParam("pk") Long id) {
		projectService.updateForcastedEndDate(forcastedEndDate, id);
		System.out.println("Project sector Updated!");
		System.out.println(forcastedEndDate + "--" + id);
		return "";
	}
	
	@RequestMapping(value = "/getProjectNames")
	public @ResponseBody Object getProjectNames() {
		List<Project> names = projectService.findAllNames();
		return names;
	}
	
	@RequestMapping(value = "/findAllProjectManagers")
	public @ResponseBody Object findAllProjectManagers() {
		List<Project> pm = projectService.findAllProjectManagers();
		return pm;
	}
	
	@RequestMapping(value = "/findAllForcastedEndDates")
	public @ResponseBody Object findAllForcastedEndDates() throws JsonGenerationException, JsonMappingException, IOException {
		List<Project> names = projectService.findAllForcastedEndDates();
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setDateFormat(df);
    	//objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    	String ns = objectMapper.writeValueAsString(names);
		
		return ns;
	}
	
	@RequestMapping(value = "/findAllTypes")
	public @ResponseBody Object findAllTypes() {
		List<Project> types = projectService.findAllTypes();
		return types;
	}
	
	@RequestMapping(value = "/findAllClientNames")
	public @ResponseBody Object findAllClientNames() {
		List<Project> cns = projectService.findAllClientNames();
		return cns;
	}
}
