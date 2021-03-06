package com.amaris.service;

import java.util.List;

import com.amaris.model.Client;

public interface ClientService {

	Client save(Client client);
	
	List<Client> findAll();
	
	List<Client> findAllNames();
	
	Client findById(Long id);
	
	Client findFirstByName(String name);
	
	void remove(Long id);
	
	void updateClientName(String name, Long id);
	
	void updateName(String name, Long id);
	
	void updateSector(String sector, Long id);
	
	void updateEmployee(int numberOfEmployee, Long id);
	
	void updateEmail(String emailAddress, Long id);
	
	void updatePhone(String phoneNumber, Long id);
	
	void updateAddress(String address, Long id);
	
	void updateCity(String city, Long id);
	
	void updateCountry(String country, Long id);
}
