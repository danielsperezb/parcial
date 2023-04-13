package edu.eci.cvds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import edu.eci.cvds.model.Configuration;

@Repository
public interface ConfigurationRepository extends JpaRepository<Configuration, String>{
	
}




