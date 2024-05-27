package com.uep.wap.model;

import javax.persistence.*;

@Entity
@Table(name="Draw")
public class Draw {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "draw_id")
    private int drawID;
    @Column(name = "round")
    private int round;
    @Column(name = "matches")
    // check this later (what datatype)
    private String matches;

    @OneToOne(mappedBy = "draw", cascade = CascadeType.ALL)
    private Tournament tournament;



    public int getDrawID() {
        return drawID;
    }

    public void setDrawID(int draw_id) {
        this.drawID = draw_id;
    }

    public Draw(){

    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public String getMatches() {
        return matches;
    }

    public void setMatches(String matches) {
        this.matches = matches;
    }
}
