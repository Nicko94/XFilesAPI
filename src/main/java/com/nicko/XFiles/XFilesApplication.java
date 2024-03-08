package com.nicko.XFiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

import com.nicko.XFiles.Interface.AgentRepository;
import com.nicko.XFiles.Entity.Agent;

import java.util.Arrays;


@SpringBootApplication // This is the spring boot application annotated class, the main classs (this one) should be in the base package (also this one) or another package including this annotated class
public class XFilesApplication {
	public static void main(String[] args) {
		SpringApplication.run(XFilesApplication.class, args);
	}
	@Bean // This annotation declares the method as a bean, which is an object managed by the Spring Inversion of Control container; this tells Spring that the return value of the method should be managed as a bean
	public CommandLineRunner loadData(AgentRepository agentRepository){ // The CommandLineRunner is a functional interface provided by Spring Boot that contains a "run" method that gets executed when the application starts, the "loadData" method is implementing this interface to run at startup. The "loadData method loads some initial values into the application, it takes an "AgentRepository" as an argument indicating that it will interact with the repository for storing "Agent" entities.
		return args -> {
			Agent scul = new Agent(
					"February 23, 1964",
					"Dana",
					"Katherine",
					"Scully",
					"Oxford University",
					"Human",
					"Female",
					"Physician",
					"Federal Bureau of Investigation",
					"Roman Catholic",
					"Washington, D.C.",
					"Fox William Moulder"
			);
			Agent fox = new Agent(
					"October 13, 1961",
					"Fox",
					"William",
					"Moulder",
					"Maryland University",
					"Human",
					"Male",
					"Psychologist",
					"Federal Bureau of Investigation",
					"None",
					"Washington, D.C.",
					"Dana Katherine Scully"
			);
			//agentRepository.saveAll(Arrays.asList(agent1, agent2));
		};
	}
}
