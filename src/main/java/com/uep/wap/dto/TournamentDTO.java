package com.uep.wap.dto;

public class TournamentDTO {

    private String starting_date;
    private String ending_date;
    private int participants_number;
    private String type;
    private String category;
    private String place;
    private String matchDate;
    private String organizerName;

    public String getOrganizerName() {
        return organizerName;
    }

    public String getMatchDate() {
        return matchDate;
    }
    /*
    private int organizer_id;
    private int draw_id;
    private int PricePool_id;

     */

    public String getStarting_date() {
        return starting_date;
    }

    public void setStarting_date(String starting_date) {
        this.starting_date = starting_date;
    }

    public String getEnding_date() {
        return ending_date;
    }

    public void setEnding_date(String ending_date) {
        this.ending_date = ending_date;
    }

    public int getParticipants_number() {
        return participants_number;
    }

    public void setParticipants_number(int participants_number) {
        this.participants_number = participants_number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    /*
    public int getOrganizer_id() {
        return organizer_id;
    }

    public void setOrganizer_id(int organizer_id) {
        this.organizer_id = organizer_id;
    }

    public int getDraw_id() {
        return draw_id;
    }

    public void setDraw_id(int draw_id) {
        this.draw_id = draw_id;
    }

    public int getPricePool_id() {
        return PricePool_id;
    }

    public void setPricePool_id(int pricePool_id) {
        this.PricePool_id = pricePool_id;
    }


     */
}
