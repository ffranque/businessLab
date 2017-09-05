package com.amaris.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amaris.model.Consultant;

@Repository("consultantRepository")
public interface ConsultantRepository extends JpaRepository<Consultant, Long> {

	Consultant findFirstByName(String name);
}
