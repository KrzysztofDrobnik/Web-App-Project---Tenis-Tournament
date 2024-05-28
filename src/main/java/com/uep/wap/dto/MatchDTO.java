package com.uep.wap.dto;

public class MatchDTO {

    String date;
    String additional_info;
    String player_1;
    String player_2;
    String score;
    String winner;
    String courtName;
    String refereeLastName;
    String tournamentStartingDate;


    public String getTournamentStartingDate() {
        return tournamentStartingDate;
    }

    public String getCourtName() {
        return courtName;
    }

    public String getRefereeLastName() {
        return refereeLastName;
    }






    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAdditional_info() {
        return additional_info;
    }

    public void setAdditional_info(String additional_info) {
        this.additional_info = additional_info;
    }

    public String getPlayer_1() {
        return player_1;
    }

    public void setPlayer_1(String player_1) {
        this.player_1 = player_1;
    }

    public String getPlayer_2() {
        return player_2;
    }

    public void setPlayer_2(String player_2) {
        this.player_2 = player_2;
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
