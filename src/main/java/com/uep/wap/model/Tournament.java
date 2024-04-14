package com.uep.wap.model;

import javax.persistence.*;

@Entity
@Table(name="Tournament")
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tournament_id")
    private int tournament_id;
    @Column(name = "starting_date")
    private String startng_date;
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
    @Column(name = "draws")
    private String draws;


    @ManyToOne
    @JoinColumn(name = "organizer_id")
    private Organizer organizer;

    public int getTournament_id() {
        return tournament_id;
    }

    public void setTournament_id(int tournament_id) {
        this.tournament_id = tournament_id;
    }
    public Tournament(){

    }
    public String getStartng_date() {
        return startng_date;
    }

    public void setStartng_date(String startng_date) {
        this.startng_date = startng_date;
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

    public String getDraws() {
        return draws;
    }

    public void setDraws(String draws) {
        this.draws = draws;
    }
}
