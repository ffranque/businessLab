package com.amaris.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amaris.model.Consultant;
import com.amaris.repository.ConsultantRepository;

@Service("ConsultantService")
@Transactional
public class ConsultantServiceImpl implements ConsultantService {

	@Autowired
	private ConsultantRepository consultantRepository;

	public Consultant save(Consultant consultant) {
		return consultantRepository.saveAndFlush(consultant);
	}

	public List<Consultant> findAll() {
		return consultantRepository.findAll();
	}

	public Consultant findById(Long id) {
		return consultantRepository.findOne(id);
	}

	public void remove(Long id) {
		consultantRepository.delete(id);
	}

	public Consultant findFirstByName(String name) {
		return consultantRepository.findFirstByName(name);
	}

}
