package com.bookmyshow.city;

import com.bookmyshow.theatre.CinemaTheatre;

import java.util.List;

public class City {

    private String name;
    private String state;
    private String country;
    private String zipcode;
    private List<CinemaTheatre> cinemaTheatres;

    public City(String name, List<CinemaTheatre> cinemaTheatres) {
        this.name = name;
        this.cinemaTheatres = cinemaTheatres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CinemaTheatre> getCinemaTheatres() {
        return cinemaTheatres;
    }

    public void setCinemaTheatres(List<CinemaTheatre> cinemaTheatres) {
        this.cinemaTheatres = cinemaTheatres;
    }

}
