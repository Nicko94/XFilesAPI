package com.nicko.XFiles.Entity;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;

@Entity
public class Anomaly {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY);
    private Long id;
    private String name;

    public Anomaly(String name){
        this.name = name;
    }
}
