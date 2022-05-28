package com.bookmyshow.hall;

import com.bookmyshow.seat.HallSeat;
import com.bookmyshow.show.Show;

import java.util.List;

public class Hall {

    private String name;
    private List<HallSeat> hallSeats;
    private List<Show> shows;

    public Hall(String name, List<HallSeat> hallSeats, List<Show> shows) {
        this.name = name;
        this.hallSeats = hallSeats;
        this.shows = shows;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<HallSeat> getSeats() {
        return hallSeats;
    }

    public void setSeats(List<HallSeat> hallSeats) {
        this.hallSeats = hallSeats;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
}
