package com.uep.wap.dto;

public class RefereeDTO {

    private String first_name;
    private String last_name;
    private String matchDate;

    public String getMatchDate() {
        return matchDate;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
