package com.amaris.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Client {

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	private String name;

	@NotNull
	private String sector;

	@NotNull
	private String contactName;

	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
	private List<Project> projects = new ArrayList<Project>();
	

	private int numberOfEmployee;
	private String emailAddres;
	private String phoneNumber;
	private String address;
	private String city;
	private String country;
	private boolean isCanceled;

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getContactName() {
		return contactName;
	}

	public String getCountry() {
		return country;
	}

	public String getEmailAddres() {
		return emailAddres;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public String getSector() {
		return sector;
	}

	public boolean isCanceled() {
		return isCanceled;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCanceled(boolean isCanceled) {
		this.isCanceled = isCanceled;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setEmailAddres(String emailAddres) {
		this.emailAddres = emailAddres;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumberOfEmployee(int numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

}
