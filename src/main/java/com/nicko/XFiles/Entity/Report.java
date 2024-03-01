package com.nicko.XFiles.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String date;
    private String title;
    private String type;
    private String description;
    private String anomaly;
    private String staff;

    public Report(String date, String title, String type, String description, String anomaly, String staff){
        this.date = date;
        this.title = title;
        this.type = type;
        this.description = description;
        this.anomaly = anomaly;
        this.staff = staff;
    }
}
