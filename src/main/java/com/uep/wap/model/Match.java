package com.uep.wap.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Matches")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "match_id")
    private int matchID;
    @Column(name = "date")
    private String date;
    @Column(name = "additional_info")
    private String additionalInfo;
    @Column(name = "player1")
    private String player1;
    @Column(name = "player2")
    private String player2;
    @Column(name = "score")
    private String score;
    @Column(name = "winner")
    private String winner;

    @OneToOne(mappedBy = "match", cascade =  CascadeType.ALL)
    private Statistics statistics;

    @ManyToMany(cascade =  CascadeType.ALL)
    @JoinTable(name = "match_referee", joinColumns = @JoinColumn(name = "match_id"), inverseJoinColumns = @JoinColumn(name = "referee_id"))
    private List<Referee> referees;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "match_court", joinColumns = @JoinColumn(name = "match_id"), inverseJoinColumns = @JoinColumn(name = "court_id"))
    private List<Court> courts;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "match_player", joinColumns = @JoinColumn(name = "match_id"), inverseJoinColumns = @JoinColumn(name = "player_id"))
    private List<Player> players;

    @ManyToOne
    @JoinColumn(name = "tournament_id")
    private Tournament tournament;

    public int getMatchID() {
        return matchID;
    }

    public void setMatchID(int match_id) {
        this.matchID = match_id;
    }
    public Match(){

    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additional_info) {
        this.additionalInfo = additional_info;
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
