package org.example;

public class CinemaItem {
    private int id;
    private int cinemaId;
    private String cinemaName;
    public CinemaItem (int id, int cinemaId, String cinemaName) {
        this.id = id;
        this.cinemaId = cinemaId;
        this.cinemaName = cinemaName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public  int getCinemaId() {
        return cinemaId;
    }
    public void setCinemaId (int cinemaId) {
        this.cinemaId = cinemaId;
    }
    public String getCinemaName () {
        return cinemaName;
    }
    public void setCinemaName (String cinemaName) {
        this.cinemaName = cinemaName;
    }
}
