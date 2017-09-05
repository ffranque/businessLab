package com.amaris.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Project {

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	private String name;

	@ManyToOne
	private Client client;

	@NotNull
	private String projectManager;

	@NotNull
	private String type;

	@NotNull
	private String sector;

	@ManyToOne
	private Consultant consultant;

	private String clientName;
	private Date beginningDate;
	private Date endDate;
	private Date forcastedEndDate;
	private boolean isCanceled;

	public Date getBeginningDate() {
		return beginningDate;
	}

	public Client getClient() {
		return client;
	}

	public String getClientName() {
		return clientName;
	}

	public Consultant getConsultant() {
		return consultant;
	}

	public Date getEndDate() {
		return endDate;
	}

	public Date getForcastedEndDate() {
		return forcastedEndDate;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getProjectManager() {
		return projectManager;
	}

	public String getSector() {
		return sector;
	}

	public String getType() {
		return type;
	}

	public boolean isCanceled() {
		return isCanceled;
	}

	public void setBeginningDate(Date beginningDate) {
		this.beginningDate = beginningDate;
	}

	public void setCanceled(boolean isCanceled) {
		this.isCanceled = isCanceled;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public void setConsultant(Consultant consultant) {
		this.consultant = consultant;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void setForcastedEndDate(Date forcastedEndDate) {
		this.forcastedEndDate = forcastedEndDate;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public void setType(String type) {
		this.type = type;
	}

}
