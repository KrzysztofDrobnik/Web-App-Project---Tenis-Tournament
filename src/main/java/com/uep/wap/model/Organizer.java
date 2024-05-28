package com.uep.wap.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Organizer")
public class Organizer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "organizer_id")
    private int organizerID;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "organizer", cascade = CascadeType.ALL)
    private List<Tournament> tournaments;


    public int getOrganizerID() {
        return organizerID;
    }

    public void setOrganizerID(int organizer_id) {
        this.organizerID = organizer_id;
    }

    public Organizer(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTournaments(List<Tournament> tournaments) {
        this.tournaments = tournaments;
    }






}
