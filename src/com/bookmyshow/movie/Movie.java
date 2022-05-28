package com.bookmyshow.movie;

import com.bookmyshow.show.Show;

import java.util.List;

public class Movie {

    private String name;
    private Genre genre;
    private String duration;
    private String language;
    private List<Show> shows;

    public Movie(String name, Genre genre, String duration, String language) {
        this.name = name;
        this.genre = genre;
        this.duration = duration;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
