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
public class Consultant {

	@Id
	@GeneratedValue
	private Long id;
	@NotNull
	private String name;
	private boolean isCanceled;
	@OneToMany(mappedBy = "consultant", cascade = CascadeType.ALL)
	private List<Project> projects = new ArrayList<Project>();

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public boolean isCanceled() {
		return isCanceled;
	}

	public void setCanceled(boolean isCanceled) {
		this.isCanceled = isCanceled;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

}
