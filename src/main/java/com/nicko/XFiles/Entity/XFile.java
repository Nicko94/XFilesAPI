package com.nicko.XFiles.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Anomaly anomaly;
    private Report report;

    public File(String anomalyName, String agentName){
        this.anomalyName = anomalyName;
        this.agentName = agentName;
    }
}
