package com.uep.wap.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Tournament")
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tournament_id")
    private int tournament_id;
    @Column(name = "starting_date")
    private String starting_date;
    @Column(name = "ending_date")
    private String ending_date;
    @Column(name = "participants_number")
    private int participants_number;
    @Column(name = "type")
    private String type;
    @Column(name = "category")
    private String category;
    @Column(name = "place")
    private String place;



    @ManyToOne
    @JoinColumn(name = "organizer_id")
    private Organizer organizer;

    @OneToMany(mappedBy = "tournament", cascade = CascadeType.ALL)
    private List<Match> matches;

    @OneToOne
    @JoinColumn(name = "draw_id")
    private Draw draw;

    @ManyToOne
    @JoinColumn(name = "pricePool_id")
    private Tournament tournament;


    public int getTournament_id() {
        return tournament_id;
    }

    public void setTournament_id(int tournament_id) {
        this.tournament_id = tournament_id;
    }
    public Tournament(){

    }
    public String getStarting_date() {
        return starting_date;
    }

    public void setStarting_date(String starting_date) {
        this.starting_date = starting_date;
    }

    public String getEnding_date() {
        return ending_date;
    }

    public void setEnding_date(String ending_date) {
        this.ending_date = ending_date;
    }

    public int getParticipants_number() {
        return participants_number;
    }

    public void setParticipants_number(int participants_number) {
        this.participants_number = participants_number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }


}
