package com.uep.wap.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Referee")
public class Referee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "referee_id")
    private int refereeID;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    @ManyToMany(mappedBy = "referees")
    private List<Match> matches;

    public int getRefereeID() {
        return refereeID;
    }

    public void setRefereeID(int referee_int) {
        this.refereeID = referee_int;
    }

    public Referee(){

    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first_name) {
        this.firstName = first_name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last_name) {
        this.lastName = last_name;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }


}
