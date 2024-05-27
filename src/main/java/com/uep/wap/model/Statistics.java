package com.uep.wap.model;

import javax.persistence.*;

@Entity
@Table(name="Statistics")
public class Statistics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "statistics_id")
    private int statisticsID;
    @Column(name = "aces")
    private int aces;
    @Column(name = "first_Serve")
    private int firstServe;
    @Column(name = "second_Serve")
    private int secondServe;
    @Column(name = "double_Faults")
    private int doubleFaults;
    @Column(name = "winners")
    private int winners;

    @OneToOne
    @JoinColumn(name = "match_id")
    private Match match;


    public int getStatisticsID() {
        return statisticsID;
    }

    public void setStatisticsID(int statistics_id) {
        this.statisticsID = statistics_id;
    }

    public Statistics(){

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

    public void setFirstServe(int first_Serve) {
        this.firstServe = first_Serve;
    }

    public int getSecondServe() {
        return secondServe;
    }

    public void setSecondServe(int second_Serve) {
        this.secondServe = second_Serve;
    }

    public int getDoubleFaults() {
        return doubleFaults;
    }

    public void setDoubleFaults(int double_Faults) {
        this.doubleFaults = double_Faults;
    }

    public int getWinners() {
        return winners;
    }

    public void setWinners(int winners) {
        this.winners = winners;
    }


}
