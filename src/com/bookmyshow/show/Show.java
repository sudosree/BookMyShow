package com.bookmyshow.show;

import com.bookmyshow.booking.Booking;
import com.bookmyshow.movie.Movie;

import java.util.List;

public class Show {

    private String showId;
    private Movie movie;
    private String timing;
    private List<ShowSeat> showSeats;
    private List<Booking> bookings;

    public Show(String showId, Movie movie, String timing, List<ShowSeat> showSeats) {
        this.showId = showId;
        this.movie = movie;
        this.timing = timing;
        this.showSeats = showSeats;
    }

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public List<ShowSeat> getShowSeats() {
        return showSeats;
    }

    public void setShowSeats(List<ShowSeat> showSeats) {
        this.showSeats = showSeats;
    }
}
