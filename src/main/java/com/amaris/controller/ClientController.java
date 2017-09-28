package com.amaris.controller;

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
import com.amaris.service.ClientService;

@Controller
public class ClientController {
	
	@Autowired
	private ClientService clientService;

	@RequestMapping(value = "/clients", method = RequestMethod.GET)
	public String clients(Model model) {
		model.addAttribute("title", "Clients");
		model.addAttribute("client", new Client());
		List<Client> clients = clientService.findAll();
		model.addAttribute("clientList", clients);
		
		return "clients";
	}
	
	@RequestMapping(value = "/csearch", method = RequestMethod.GET)
	public String searchClients(@RequestParam("group") String group, @RequestParam("query") String query, Model model) {
		model.addAttribute("title", "Clients");
		model.addAttribute("client", new Client());
		List<Client> clients = clientService.searchClient(group, query);
		model.addAttribute("clientList", clients);
		//System.out.println(group + "--" + query);
		
		return "clients";
	}
	
	@RequestMapping(value = "/clientDetail", method = RequestMethod.GET)
	public String clientDetails(Model model, Long id) {
		model.addAttribute("title", "Details");
		Client client = clientService.findById(id);
		model.addAttribute("client", client);
		
		return "clientDetail";
	}

	@RequestMapping(value = "/addClient", method = RequestMethod.POST)
	public String saveClient(@ModelAttribute("client") Client client) {

		clientService.save(client);
		
		return "redirect:clients.html";
	}
	
	@RequestMapping(value = "/client/updateContactName", method = RequestMethod.POST)
	public @ResponseBody String editClientName(@RequestParam("value") String contactName, @RequestParam("pk") Long id) {
		clientService.updateClientName(contactName, id);
		System.out.println("Contact Name Update!");
		System.out.println(contactName + "--" + id);
		return "";
	}
	
	@RequestMapping(value = "/client/updateName", method = RequestMethod.POST)
	public @ResponseBody String editName(@RequestParam("value") String name, @RequestParam("pk") Long id) {
		clientService.updateName(name, id);
		System.out.println("Name Update!");
		System.out.println(name + "--" + id);
		return "";
	}
	
	@RequestMapping(value = "/client/updateSector", method = RequestMethod.POST)
	public @ResponseBody String editSector(@RequestParam("value") String sector, @RequestParam("pk") Long id) {
		clientService.updateSector(sector, id);
		System.out.println("Sector Updated!");
		System.out.println(sector + "--" + id);
		return "";
	}
	
	@RequestMapping(value = "/client/updateEmployeeNumber", method = RequestMethod.POST)
	public @ResponseBody String editEmployeeNumber(@RequestParam("value") int employeeNumber, @RequestParam("pk") Long id) {
		clientService.updateEmployee(employeeNumber, id);
		System.out.println("EmployeeNumber Updated!");
		System.out.println(employeeNumber + "--" + id);
		return "";
	}
	
	@RequestMapping(value = "/client/updateEmail", method = RequestMethod.POST)
	public @ResponseBody String editEmail(@RequestParam("value") String email, @RequestParam("pk") Long id) {
		clientService.updateEmail(email, id);
		System.out.println("email Updated!");
		System.out.println(email + "--" + id);
		return "";
	}
	
	@RequestMapping(value = "/client/updatePhone", method = RequestMethod.POST)
	public @ResponseBody String editPhone(@RequestParam("value") String phone, @RequestParam("pk") Long id) {
		clientService.updatePhone(phone, id);
		System.out.println("phone Updated!");
		System.out.println(phone + "--" + id);
		return "";
	}
	
	@RequestMapping(value = "/client/updateAddress", method = RequestMethod.POST)
	public @ResponseBody String editAddress(@RequestParam("value") String address, @RequestParam("pk") Long id) {
		clientService.updateAddress(address, id);
		System.out.println("address Updated!");
		System.out.println(address + "--" + id);
		return "";
	}
	
	@RequestMapping(value = "/client/updateCity", method = RequestMethod.POST)
	public @ResponseBody String editCity(@RequestParam("value") String city, @RequestParam("pk") Long id) {
		clientService.updateCity(city, id);
		System.out.println("City Updated!");
		System.out.println(city + "--" + id);
		return "";
	}
	
	@RequestMapping(value = "/getClientNames")
	public @ResponseBody Object getClientName() {
		List<Client> names = clientService.findAllNames();
		return names;
	}
	
	@RequestMapping(value = "/findAllPhones")
	public @ResponseBody Object findAllPhones() {
		List<Client> phones = clientService.findAllPhones();
		return phones;
	}
	
	@RequestMapping(value = "/findAllSectors")
	public @ResponseBody Object findAllSector() {
		List<Client> sectors = clientService.findAllSector();
		return sectors;
	}
	
	@RequestMapping(value = "/findAllContactNames")
	public @ResponseBody Object findAllContactNames() {
		List<Client> contactNames = clientService.findAllContactNames();
		return contactNames;
	}
	
	@RequestMapping(value = "/findAllEmails")
	public @ResponseBody Object findAllEmails() {
		List<Client> emails = clientService.findAllEmails();
		return emails;
	}
	
	@RequestMapping(value = "/client/updateCountry", method = RequestMethod.POST)
	public @ResponseBody String editCountry(@RequestParam("value") String country, @RequestParam("pk") Long id) {
		clientService.updateCountry(country, id);
		System.out.println("country Updated!");
		System.out.println(country + "--" + id);
		return "";
	}
}
