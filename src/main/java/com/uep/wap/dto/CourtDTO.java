package com.uep.wap.dto;

public class CourtDTO {

    String name;
    String surface;
    String matchDate;

    public String getMatchDate() {
        return matchDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }
}
