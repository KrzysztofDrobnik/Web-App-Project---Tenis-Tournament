package com.uep.wap.dto;

public class PlayerDTO {

    private int numberOfGames;
    private int tournamentsWon;
    private String successes;
    private String matchDate;
    private String userLastName;

    public String getUserLastName() {
        return userLastName;
    }

    public String getMatchDate() {
        return matchDate;
    }

    public int getNumberOfGames() {
        return numberOfGames;
    }

    public void setNumberOfGames(int numberOfGames) {
        this.numberOfGames = numberOfGames;
    }

    public int getTournamentsWon() {
        return tournamentsWon;
    }

    public void setTournamentsWon(int tournamentsWon) {
        this.tournamentsWon = tournamentsWon;
    }

    public String getSuccesses() {
        return successes;
    }

    public void setSuccesses(String successes) {
        this.successes = successes;
    }
}
