package com.uep.wap.dto;

public class OrganizerDTO {

    private String name;
    private String description;
    private String tournamentStartingDate;

    public String getTournamentStartingDate() {
        return tournamentStartingDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
