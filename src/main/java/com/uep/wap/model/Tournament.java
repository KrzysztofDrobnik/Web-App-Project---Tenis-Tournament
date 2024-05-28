package com.uep.wap.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Tournament")
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tournament_id")
    private int tournamentID;
    @Column(name = "starting_date")
    private String startingDate;
    @Column(name = "ending_date")
    private String endingDate;
    @Column(name = "participants_number")
    private int participantsNumber;
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
    private PricePool pricePool_id;


    public int getTournamentID() {
        return tournamentID;
    }

    public void setTournamentID(int tournament_id) {
        this.tournamentID = tournament_id;
    }
    public Tournament(){

    }
    public String getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(String starting_date) {
        this.startingDate = starting_date;
    }

    public String getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(String ending_date) {
        this.endingDate = ending_date;
    }

    public int getParticipantsNumber() {
        return participantsNumber;
    }

    public void setParticipantsNumber(int participants_number) {
        this.participantsNumber = participants_number;
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

    public Tournament(String starting_date, String ending_date, int participants_number, String type, String category, String place){

    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    public void setDraw(Draw draw) {
        this.draw = draw;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }





}
