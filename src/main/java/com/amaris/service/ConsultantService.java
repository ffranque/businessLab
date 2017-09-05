package com.amaris.service;

import java.util.List;

import com.amaris.model.Consultant;

public interface ConsultantService {

	Consultant save(Consultant consultant);
	List<Consultant> findAll();
	Consultant findById(Long id);
	void remove(Long id);
	Consultant findFirstByName(String name);
}
