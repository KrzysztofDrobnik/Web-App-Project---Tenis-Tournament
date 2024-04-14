package com.uep.wap.model;

import javax.persistence.*;

@Entity
@Table(name="Player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="player_id")
    private int player_id;
    @Column(name="numberOfGames")
    private int numberOfGames;
    @Column(name = "TournamentsWon")
    private int TournamentsWon;
    @Column(name = "Successes")
    private String Successes;

    public int getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }
    public Player(){

    }
    public int getNumberOfGames() {
        return numberOfGames;
    }

    public void setNumberOfGames(int numberOfGames) {
        this.numberOfGames = numberOfGames;
    }

    public int getTournamentsWon() {
        return TournamentsWon;
    }

    public void setTournamentsWon(int tournamentsWon) {
        TournamentsWon = tournamentsWon;
    }

    public String getSuccesses() {
        return Successes;
    }

    public void setSuccesses(String successes) {
        Successes = successes;
    }
}
