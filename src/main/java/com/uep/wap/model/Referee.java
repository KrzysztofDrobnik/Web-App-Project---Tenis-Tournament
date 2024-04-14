package com.uep.wap.model;

import javax.persistence.*;

@Entity
@Table(name="Referee")
public class Referee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "referee_id")
    private int referee_int;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;

    public int getReferee_int() {
        return referee_int;
    }

    public void setReferee_int(int referee_int) {
        this.referee_int = referee_int;
    }

    public Referee(){

    }
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
