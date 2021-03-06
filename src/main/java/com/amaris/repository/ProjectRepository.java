package com.amaris.repository;

import java.util.Date;
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
	@Query("Update Project p set p.name = :name where id = :id")
	void updateName(@Param("name") String name, @Param("id") Long id);
	
	@Modifying
	@Query("Update Project p set p.type = :type where id = :id")
	void updateType(@Param("type") String type, @Param("id") Long id);
	
	@Modifying
	@Query("Update Project p set p.clientName = :clientName where id = :id")
	void updateClientName(@Param("clientName") String clientName, @Param("id") Long id);
	
	@Modifying
	@Query("Update Project p set p.projectManager = :projectManager where id = :id")
	void updateProjectManager(@Param("projectManager") String projectManager, @Param("id") Long id);
	
	@Modifying
	@Query("Update Project p set p.sector = :sector where id = :id")
	void updateSector(@Param("sector") String sector, @Param("id") Long id);
	
	@Modifying
	@Query("Update Project p set p.beginningDate = :beginningDate where id = :id")
	void updateBeginningDate(@Param("beginningDate") Date beginningDate, @Param("id") Long id);
	
	@Modifying
	@Query("Update Project p set p.endDate = :endDate where id = :id")
	void updateEndDate(@Param("endDate") Date endDate, @Param("id") Long id);
	
	@Modifying
	@Query("Update Project p set p.forcastedEndDate = :forcastedEndDate where id = :id")
	void updateForcastedEndDate(@Param("forcastedEndDate") Date forcastedEndDate, @Param("id") Long id);
	
	@Modifying
	@Query("Update Project p set p.consultant = :consultant where id = :id")
	void updateProjectConsultant(@Param("consultant") Consultant consultant, @Param("id") Long id);
	
	@Modifying
	@Query("Update Consultant c set c.isCanceled = :isCanceled where id = :id")
	void cancelConsultant(@Param("isCanceled") boolean isCanceled, @Param("id") Long id);
	
	@Modifying
	@Query("Update Project p set p.isCanceled = :isCanceled where id = :id")
	void cancelProject(@Param("isCanceled") boolean isCanceled, @Param("id") Long id);
}
