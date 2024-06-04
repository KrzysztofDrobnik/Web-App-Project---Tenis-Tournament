package com.uep.wap.dto;

public class CourtDTO {

    private String name;
    private String surface;
    private String matchDate;

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
