package com.nicko.XFiles.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;

@Entity
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY);
    private Long id;
    private String name;
    private String type;
    private String description;

    public Report(String name, String type, String description){
        this.name = name;
        this.type = type;
        this.description = description;
    }
}
