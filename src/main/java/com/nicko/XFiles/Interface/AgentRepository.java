package com.nicko.XFiles.Interface;

import com.nicko.XFiles.Entity.Agent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface AgentRepository extends JpaRepository<Agent, Long>{ // This repository interface provides CRUD functionalities, extending "PagingAndSortingRepository" which extends "CrudRepository"
    // Custom queries additional to the JPA Repository interface
    // Test query to find Agents by name:
    //@Query("SELECT a FROM Agent a WHERE a.name = ?1");
    Agent findAgentById(Long id);
    Agent findAgentBySurname(String lastName);
    Agent findAgentByGender(String gender);
    Agent findAgentByOccupation(String occupation);
}
