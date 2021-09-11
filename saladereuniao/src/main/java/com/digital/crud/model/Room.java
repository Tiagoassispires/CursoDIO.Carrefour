package com.digital.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="meetingroom")
public class Room {
    
    private long id;
    private String name;
    private String date;
    private String starthour;
    private String endhour;

    public Room(long id, String name, String date, String starthour, String endhour){
        this.id=id;
        this.name=name;
        this.date=date;
        this.starthour=starthour;
        this.endhour=endhour;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    @Column(name="endhour", nullable = false)
    public String getEndhour() {
        return endhour;
    }
    public void setEndhour(String endhour) {
        this.endhour = endhour;
    }
    @Column(name="starthour", nullable = false)
    public String getStarthour() {
        return starthour;
    }
    public void setStarthour(String starthour) {
        this.starthour = starthour;
    }
    @Column(name="date", nullable = false)
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    @Column(name="name", nullable = false)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(long id) {
        this.id = id;
    }
    @Override
    public String toString(){
        return "Room [id="+id+",name="+ name+ ",starthour="+ starthour+ ",endhour="+ endhour+"]";

    }
}
