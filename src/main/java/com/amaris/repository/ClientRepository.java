package com.amaris.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.amaris.model.Client;

@Repository("clientRepository")
public interface ClientRepository extends JpaRepository<Client, Long> {
	
	@Modifying
	@Query("Update Client c SET c.contactName=:contactName WHERE c.id=:id")
	void updateClientName(@Param("contactName") String contactName,@Param("id") Long id);
	
	@Modifying
	@Query("Update Client c SET c.name=:name WHERE c.id=:id")
	void updateName(@Param("name") String name,@Param("id") Long id);
	
	@Modifying
	@Query("Update Client c SET c.sector=:sector WHERE c.id=:id")
	void updateSector(@Param("sector") String sector,@Param("id") Long id);
	
	@Modifying
	@Query("Update Client c SET c.numberOfEmployee=:numberOfEmployee WHERE c.id=:id")
	void updateEmployee(@Param("numberOfEmployee") int numberOfEmployee,@Param("id") Long id);
	
	@Modifying
	@Query("Update Client c SET c.emailAddres=:emailAddress WHERE c.id=:id")
	void updateEmail(@Param("emailAddress") String emailAddress,@Param("id") Long id);
	
	@Modifying
	@Query("Update Client c SET c.phoneNumber=:phoneNumber WHERE c.id=:id")
	void updatePhone(@Param("phoneNumber") String phoneNumber,@Param("id") Long id);
	
	@Modifying
	@Query("Update Client c SET c.address=:address WHERE c.id=:id")
	void updateAddress(@Param("address") String address,@Param("id") Long id);
	
	@Modifying
	@Query("Update Client c SET c.city=:city WHERE c.id=:id")
	void updateCity(@Param("city") String city,@Param("id") Long id);
	
	@Modifying
	@Query("Update Client c SET c.country=:country WHERE c.id=:id")
	void updateCountry(@Param("country") String country,@Param("id") Long id);
	
	@Query("Select c.name from Client c")
	List<Client> findAllNames();
	
	@Query("Select c.sector from Client c")
	List<Client> findAllSector();
	
	@Query("Select c.contactName from Client c")
	List<Client> findAllContactNames();
	
	@Query("Select c.emailAddres from Client c")
	List<Client> findAllEmails();
	
	@Query("Select c.phoneNumber from Client c")
	List<Client> findAllPhones();
	
	Client findFirstByName(String name);

}
