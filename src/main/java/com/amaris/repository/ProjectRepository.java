package com.amaris.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.amaris.model.Client;
import com.amaris.model.Consultant;
import com.amaris.model.Project;

@Repository("projectRepository")
public interface ProjectRepository extends JpaRepository<Project, Long> {

	@Query("Select c.name from Client c")
	List<Client> findAllClientsNames();
	
	@Modifying
	@Query("Update Project p set p.consultant = :consultant where id = :id")
	void updateProjectConsultant(@Param("consultant") Consultant consultant, @Param("id") Long id);
	
}
