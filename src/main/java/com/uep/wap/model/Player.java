package com.uep.wap.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="player_id")
    private int playerID;
    @Column(name="numberOfGames")
    private int numberOfGames;
    @Column(name = "TournamentsWon")
    private int TournamentsWon;
    @Column(name = "Successes")
    private String Successes;

    @ManyToMany(mappedBy = "players")
    private List<Match> matches;

    @OneToOne(mappedBy = "player", cascade = CascadeType.ALL)
    private User user;

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int player_id) {
        this.playerID = player_id;
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

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    // set User



    // public Player(int numberOfGames, int tournamentsWon, String successes){
    // }
}
