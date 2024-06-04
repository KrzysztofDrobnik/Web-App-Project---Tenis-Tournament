package com.uep.wap.dto;

public class StatisticsDTO {
    private int aces;
    private int firstServe;
    private int secondServe;
    private int doubleFaults;
    private int winners;
    private String matchDate;

    public String getMatchDate() {
        return matchDate;
    }

    public int getAces() {
        return aces;
    }

    public void setAces(int aces) {
        this.aces = aces;
    }

    public int getFirstServe() {
        return firstServe;
    }

    public void setFirstServe(int firstServe) {
        this.firstServe = firstServe;
    }

    public int getSecondServe() {
        return secondServe;
    }

    public void setSecondServe(int secondServe) {
        this.secondServe = secondServe;
    }

    public int getDoubleFaults() {
        return doubleFaults;
    }

    public void setDoubleFaults(int doubleFaults) {
        this.doubleFaults = doubleFaults;
    }

    public int getWinners() {
        return winners;
    }

    public void setWinners(int winners) {
        this.winners = winners;
    }
}
