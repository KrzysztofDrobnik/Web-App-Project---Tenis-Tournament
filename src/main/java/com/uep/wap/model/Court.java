package com.uep.wap.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Court")
public class Court {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "court_id")
    private int courtID;
    @Column(name = "name")
    private String name;
    @Column(name = "surface")
    private String surface;

    @ManyToMany(mappedBy = "courts")
    private List<Match> matches;


    public int getCourtID() {
        return courtID;
    }

    public void setCourtID(int court_id) {
        this.courtID = court_id;
    }

    public Court(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

}
