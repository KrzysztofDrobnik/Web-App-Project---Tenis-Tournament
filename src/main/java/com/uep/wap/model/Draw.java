package com.uep.wap.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Draw")
public class Draw {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "draw_id")
    private int draw_id;
    @Column(name = "round")
    private int round;
    @Column(name = "matches")
    // check this later (what datatype)
    private String matches;

    @OneToMany(mappedBy = "draw", cascade = CascadeType.ALL)
    private List<Tournament> tournaments;


    public int getDraw_id() {
        return draw_id;
    }

    public void setDraw_id(int draw_id) {
        this.draw_id = draw_id;
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
