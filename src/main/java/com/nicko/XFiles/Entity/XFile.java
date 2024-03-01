package com.nicko.XFiles.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class XFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Anomaly anomaly;
    private Report report;

    public XFile(Anomaly anomaly, Report report){
        this.anomaly = anomaly;
        this.report = report;
    }
}
