package com.nicko.XFiles.Controller;

import com.nicko.XFiles.Entity.Anomaly;
import com.nicko.XFiles.Interface.AnomalyRepository;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/anomaly")
public class AnomalyController {
    private final AnomalyRepository anomalyRepository;

    @Autowired
    public AnomalyController(AnomalyRepository anomalyRepository){
        this.anomalyRepository = anomalyRepository;
    }

    @GetMapping
    public List<Anomaly> getAllAnomalies(){
        return anomalyRepository.findAll();
    }

    @GetMapping("/{name}")
    public Anomaly fetchAnomalyByName(@PathVariable String name){
        return anomalyRepository.findByName(name);
    }

    @GetMapping("/{type}")
    public Anomaly fetchAnomalyByType(@PathVariable String type){
        return anomalyRepository.findByType(type);
    }

    @PostMapping
    public Anomaly createAnomaly(@RequestBody Anomaly anomalyRequest){
        Anomaly storeAnomaly = new Anomaly(
                anomalyRequest.getName(),
                anomalyRequest.getType(),
                anomalyRequest.getPhenomenon(),
                anomalyRequest.getCharacteristics()
        );
        return anomalyRepository.save(storeAnomaly);
    }
}
