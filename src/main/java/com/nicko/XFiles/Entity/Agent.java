package com.nicko.XFiles.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This annotation declares the class as an entity (Basically represents a table of a db). Each instance of this entity represents a row of the corresponding table, and the attributes of this class (entity) represent the columns
public class Agent {
    @Id // This sets the ID as the primary key of the entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) // And this specifies how the PK should be generated, in this case it indicates that the PK should automatically be generated by the underlying DB
    private Long id;
    private String birthDate;
    private String firstName;
    private String middleName;
    private String lastName;
    private String education;
    private String species;
    private String gender;
    private String occupation;
    private String affiliation;
    private String religion;
    private String residence;
    private String partner;

    public Agent(String birthDate, String firstName, String middleName, String lastName, String education, String species, String gender, String occupation, String affiliation, String religion, String residence, String partner) {
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.education = education;
        this.species = species;
        this.gender = gender;
        this.occupation = occupation;
        this.affiliation = affiliation;
        this.religion = religion;
        this.residence = residence;
        this.partner = partner;
    }

    public String getBirthDate(){
        return this.birthDate;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getMiddleName(){
        return this.middleName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getEducation(){
        return this.education;
    }
    public String getSpecies(){
        return this.species;
    }
    public String getGender(){
        return this.gender;
    }
    public String getOccupation(){
        return this.occupation;
    }
    public String getAffiliation(){
        return this.affiliation;
    }
    public String getReligion(){
        return this.religion;
    }
    public String getResidence(){
        return this.residence;
    }
    public String getPartner(){
        return this.partner;
    }
}
