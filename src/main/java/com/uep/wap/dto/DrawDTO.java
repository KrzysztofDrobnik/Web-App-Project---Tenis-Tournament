package com.uep.wap.dto;

public class DrawDTO {

    private int round;
    private String matches;
    private String tournamentStartingDate;

    public String getTournamentStartingDate() {
        return tournamentStartingDate;
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
