package com.nicko.XFiles.Entity;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;

@Entity
public class Anomaly {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    private String phenomenon;
    private String characteristics;

    public Anomaly(String name, String type, String phenomenon, String characteristics){
        this.name = name;
        this.type = type;
        this.phenomenon = phenomenon;
        this.characteristics = characteristics;

    }

    public String getName(){
        return this.name;
    }

    public String getType(){
        return this.type;
    }

    public String getPhenomenon(){
        return this.phenomenon;
    }

    public String getCharacteristics(){
        return this.characteristics;
    }
}
