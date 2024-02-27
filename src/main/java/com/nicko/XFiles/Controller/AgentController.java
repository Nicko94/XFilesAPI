package com.nicko.XFiles.Controller;

import com.nicko.XFiles.Interface.AgentRepository;
import com.nicko.XFiles.Entity.Agent;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController // Specialized annotation of @Controller, it's a shorthand to annotate each method with @ResponseBody (It simplifies the creation of RESTful APIs)
@RequestMapping("/agents")
public class AgentController {
    private final AgentRepository agentRepository;

    @Autowired
    public AgentController(AgentRepository agentRepository){
        this.agentRepository = agentRepository;
    }

    @GetMapping
    public List<Agent> getAllAgents(){
        return agentRepository.findAll();
    }
    @GetMapping("/{id}")
    public String getAgentById(@PathVariable Long id){
        return "Agent by ID";
    }
    @PostMapping
    public Agent createAgent(@RequestBody Agent agent){
        return agentRepository.save(agent);
    }

    //@PostMapping
    //public String createAgent(
    //        @RequestBody String name,
    //        @RequestBody int age,
    //        @RequestBody float weight
    //){
    //    return "Posted new agent";
    //}
}
