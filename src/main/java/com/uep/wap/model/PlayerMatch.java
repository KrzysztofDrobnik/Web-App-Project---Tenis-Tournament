package com.uep.wap.model;

import javax.persistence.*;

@Entity
@Table(name="PlayerMatch")
public class PlayerMatch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PlayerMatch_id")
    private int PlayerMatch_id;
    @Column(name = "match")
    private String match;
    @Column(name = "player1")
    private String player1;
    @Column(name = "player2")
    private String player2;
    @Column(name = "score")
    private String score;
    @Column(name = "winner")
    private String winner;

    public int getPlayerMatch_id() {
        return PlayerMatch_id;
    }

    public void setPlayerMatch_id(int playerMatch_id) {
        PlayerMatch_id = playerMatch_id;
    }
    public PlayerMatch(){

    }

    public String getMatch() {
        return match;
    }

    public void setMatch(String match) {
        this.match = match;
    }

    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
}
