package com.bookmyshow.booking;

import com.bookmyshow.city.City;
import com.bookmyshow.hall.Hall;
import com.bookmyshow.movie.Genre;
import com.bookmyshow.movie.Movie;
import com.bookmyshow.seat.HallSeat;
import com.bookmyshow.show.Show;
import com.bookmyshow.show.ShowSeat;
import com.bookmyshow.show.Status;
import com.bookmyshow.theatre.CinemaTheatre;

import java.util.*;

public class BookMyShowSystem {

    private Map<String, Movie> movies;
    private Map<Integer, HallSeat> seats;
    private Map<String, ShowSeat> showSeats;
    private Map<String, Show> shows;
    private Map<String, Hall> halls;
    private Map<String, CinemaTheatre> theatres;
    private Map<String, City> cities;
    private Map<String, Booking> bookingMap;

    public BookMyShowSystem() {
        this.cities = new HashMap<>();
        this.movies = new HashMap<>();
        this.seats = new HashMap<>();
        this.showSeats = new HashMap<>();
        this.shows = new HashMap<>();
        this.halls = new HashMap<>();
        this.theatres = new HashMap<>();
        this.bookingMap = new HashMap<>();
    }

    public void addMovie(String name, Genre genre, String duration, String language) {
        Movie movie = new Movie(name, genre, duration, language);
        movies.put(name, movie);
    }

    public void addSeat(int seatNo) {
        HallSeat hallSeat = new HallSeat(seatNo);
        seats.put(seatNo, hallSeat);
    }

    public HallSeat getSeat(int seatNo) {
        return seats.get(seatNo);
    }

    public List<HallSeat> getSeats() {
        return new ArrayList<>(seats.values());
    }

    public void addShowSeat(String id, HallSeat hallSeat, Status status) {
        ShowSeat showSeat = new ShowSeat(id, hallSeat, status);
        showSeats.put(id, showSeat);
    }

    public List<ShowSeat> getShowSeats() {
        return new ArrayList<>(showSeats.values());
    }

    public void addShow(String showId, String movieName, String timing, List<ShowSeat> showSeats) {
        Movie movie = movies.get(movieName);
        Show show = new Show(showId, movie, timing, showSeats);
        shows.put(showId, show);
    }

    public List<Show> getShows() {
        return new ArrayList<>(shows.values());
    }

    public void addHall(String name, List<HallSeat> hallSeats, List<Show> shows) {
        Hall hall = new Hall(name, hallSeats, shows);
        halls.put(name, hall);
    }

    public List<Hall> getHalls() {
        return new ArrayList<>(halls.values());
    }

    public void addCinemaTheatre(String name, List<Hall> halls) {
        CinemaTheatre theatre = new CinemaTheatre(name, halls);
        theatres.put(name, theatre);
    }

    public List<CinemaTheatre> getCinemaTheatres() {
        return new ArrayList<>(theatres.values());
    }

    public void addCity(String name, List<CinemaTheatre> cinemaTheatres) {
        City city = new City(name, cinemaTheatres);
        this.cities.put(name, city);
    }
}
