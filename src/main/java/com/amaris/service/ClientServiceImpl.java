package com.amaris.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amaris.model.Client;
import com.amaris.repository.ClientRepository;

@Service("clientService")
@Transactional
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository clientRepository;

	public Client save(Client client) {
		return clientRepository.saveAndFlush(client);
	}

	public List<Client> findAll() {
		return clientRepository.findAll();
	}

	public Client findById(Long id) {
		return clientRepository.findOne(id);
	}

	public void remove(Long id) {
		clientRepository.delete(id);
	}

	public void updateClientName(String name, Long id) {
		clientRepository.updateClientName(name, id);
	}

	public List<Client> findAllNames() {
		return clientRepository.findAllNames();
	}

	public Client findFirstByName(String name) {
		return clientRepository.findFirstByName(name);
	}

	public void updateName(String name, Long id) {
		clientRepository.updateName(name, id);
	}

	public void updateSector(String sector, Long id) {
		clientRepository.updateSector(sector, id);
	}

	public void updateEmployee(int numberOfEmployee, Long id) {
		clientRepository.updateEmployee(numberOfEmployee, id);
	}

	public void updateEmail(String emailAddress, Long id) {
		clientRepository.updateEmail(emailAddress, id);
	}

	public void updatePhone(String phoneNumber, Long id) {
		clientRepository.updatePhone(phoneNumber, id);
	}

	public void updateAddress(String address, Long id) {
		clientRepository.updateAddress(address, id);
	}

	public void updateCity(String city, Long id) {
		clientRepository.updateCity(city, id);
	}

	public void updateCountry(String country, Long id) {
		clientRepository.updateCountry(country, id);
	}

	public List<Client> findAllSector() {
		return clientRepository.findAllSector();
	}

	public List<Client> findAllContactNames() {
		return clientRepository.findAllContactNames();
	}

	public List<Client> findAllEmails() {
		return clientRepository.findAllEmails();
	}

	public List<Client> findAllPhones() {
		return clientRepository.findAllPhones();
	}

	public List<Client> searchClient(String group, String query) {
		List<Client> clients = null;

		if (group.equalsIgnoreCase("name")) {
			clients = clientRepository.findByNameIgnoreCaseContaining(query);
		} else if (group.equalsIgnoreCase("sector")) {
			clients = clientRepository.findBySectorIgnoreCaseContaining(query);
		} else if (group.equalsIgnoreCase("contact-name")) {
			clients = clientRepository.findByContactNameIgnoreCaseContaining(query);
		} else if (group.equalsIgnoreCase("e-mail")) {
			clients = clientRepository.findByEmailAddresIgnoreCaseContaining(query);
		} else if (group.equalsIgnoreCase("contact-phone")) {
			clients = clientRepository.findByPhoneNumberIgnoreCaseContaining(query);
		}

		return clients;
	}

}
