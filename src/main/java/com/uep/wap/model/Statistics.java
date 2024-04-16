package com.uep.wap.model;

import javax.persistence.*;

@Entity
@Table(name="Statistics")
public class Statistics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "statistics_id")
    private int statistics_id;
    @Column(name = "aces")
    private int aces;
    @Column(name = "first_Serve")
    private int first_Serve;
    @Column(name = "second_Serve")
    private int second_Serve;
    @Column(name = "double_Faults")
    private int double_Faults;
    @Column(name = "winners")
    private int winners;

    @OneToOne
    @JoinColumn(name = "match_id")
    private Match match;


    public int getStatistics_id() {
        return statistics_id;
    }

    public void setStatistics_id(int statistics_id) {
        this.statistics_id = statistics_id;
    }

    public Statistics(){

    }
    public int getAces() {
        return aces;
    }

    public void setAces(int aces) {
        this.aces = aces;
    }

    public int getFirst_Serve() {
        return first_Serve;
    }

    public void setFirst_Serve(int first_Serve) {
        this.first_Serve = first_Serve;
    }

    public int getSecond_Serve() {
        return second_Serve;
    }

    public void setSecond_Serve(int second_Serve) {
        this.second_Serve = second_Serve;
    }

    public int getDouble_Faults() {
        return double_Faults;
    }

    public void setDouble_Faults(int double_Faults) {
        this.double_Faults = double_Faults;
    }

    public int getWinners() {
        return winners;
    }

    public void setWinners(int winners) {
        this.winners = winners;
    }


}
