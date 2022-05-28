package com.bookmyshow.theatre;

import com.bookmyshow.hall.Hall;
import com.bookmyshow.movie.Movie;

import java.util.List;

public class CinemaTheatre {

    private String name;
    private List<Movie> movies;
    private List<Hall> halls;

    public CinemaTheatre(String name, List<Hall> halls) {
        this.name = name;
        this.halls = halls;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Hall> getHalls() {
        return halls;
    }

    public void setHalls(List<Hall> halls) {
        this.halls = halls;
    }

}
