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
    public Agent getAgentById(@PathVariable Long id){
        return agentRepository.findAgentById(id);
    }

    @GetMapping("/{lastName}")
    public Agent getAgentBySurname(@PathVariable String lastName){
        return agentRepository.findAgentBySurname(lastName);
    }

    @GetMapping("/{gender}")
    public Agent getAgentByGender(@PathVariable String gender){
        return agentRepository.findAgentByGender(gender);
    }

    @GetMapping("/{occupation}")
    public Agent getAgentByOccupation(@PathVariable String occupation){
        return agentRepository.findAgentByOccupation(occupation);
    }

    @PostMapping
    public Agent createAgent(@RequestBody Agent agentRequest){
        Agent storeAgent = new Agent(
                agentRequest.getBirthDate(),
                agentRequest.getFirstName(),
                agentRequest.getMiddleName(),
                agentRequest.getLastName(),
                agentRequest.getEducation(),
                agentRequest.getSpecies(),
                agentRequest.getGender(),
                agentRequest.getOccupation(),
                agentRequest.getAffiliation(),
                agentRequest.getReligion(),
                agentRequest.getResidence(),
                agentRequest.getPartner()
        );
        return agentRepository.save(storeAgent);
    }

    // This is another way of doing it but I don't like it:
    //@PostMapping
    //public String createAgent(
    //        @RequestBody String name,
    //        @RequestBody int age,
    //        @RequestBody float weight
    //){
    //    return "Posted new agent";
    //}
}
