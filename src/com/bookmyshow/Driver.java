package com.bookmyshow;

import com.bookmyshow.booking.BookMyShowSystem;
import com.bookmyshow.hall.Hall;
import com.bookmyshow.movie.Genre;
import com.bookmyshow.seat.HallSeat;
import com.bookmyshow.show.Show;
import com.bookmyshow.show.ShowSeat;
import com.bookmyshow.show.Status;
import com.bookmyshow.theatre.CinemaTheatre;

import java.util.List;

public class Driver {

    public static void main(String[] args) {

        BookMyShowSystem mngr = new BookMyShowSystem();

        /* add list of movies */
        mngr.addMovie("The Witcher", Genre.ACTION, "90 minutes", "English");
        mngr.addMovie("Killing Sarai", Genre.ACTION, "90 minutes", "English");
        mngr.addMovie("Annabelle", Genre.HORROR, "120 minutes", "English");
        mngr.addMovie("The Protector", Genre.ROMANCE, "120 minutes", "English");

        /* add list of seats */
        mngr.addSeat(1);
        mngr.addSeat(2);
        mngr.addSeat(3);
        mngr.addSeat(4);
        mngr.addSeat(5);
        mngr.addSeat(6);
        mngr.addSeat(7);
        mngr.addSeat(8);
        mngr.addSeat(9);
        mngr.addSeat(10);

        /* add list of show seats */
        mngr.addShowSeat("1", mngr.getSeat(1), Status.AVAILABLE);
        mngr.addShowSeat("2", mngr.getSeat(2), Status.AVAILABLE);
        mngr.addShowSeat("3", mngr.getSeat(3), Status.AVAILABLE);
        mngr.addShowSeat("4", mngr.getSeat(4), Status.AVAILABLE);
        mngr.addShowSeat("5",mngr.getSeat(5), Status.AVAILABLE);
        mngr.addShowSeat("6", mngr.getSeat(6), Status.AVAILABLE);
        mngr.addShowSeat("7", mngr.getSeat(7), Status.AVAILABLE);
        mngr.addShowSeat("8", mngr.getSeat(8), Status.AVAILABLE);
        mngr.addShowSeat("9", mngr.getSeat(9), Status.AVAILABLE);
        mngr.addShowSeat("10", mngr.getSeat(10), Status.AVAILABLE);

        List<ShowSeat> showSeatList = mngr.getShowSeats();

        /* add list of shows */
        mngr.addShow("1", "The Witcher", "08:30am", showSeatList);
        mngr.addShow("2", "Killing Sarai", "08:30am", showSeatList);
        mngr.addShow("3", "Annabelle", "08:30am", showSeatList);
        mngr.addShow("4", "The Protector", "08:30am", showSeatList);

        mngr.addShow("5", "The Witcher", "10:30am", showSeatList);
        mngr.addShow("6", "Killing Sarai", "10:30am", showSeatList);
        mngr.addShow("7", "Annabelle", "10:30am", showSeatList);
        mngr.addShow("8", "The Protector", "10:30am", showSeatList);

        List<HallSeat> hallSeats = mngr.getSeats();
        List<Show> shows = mngr.getShows();

        /* add list of halls */
        mngr.addHall("A", hallSeats, shows);
        mngr.addHall("B", hallSeats, shows);
        mngr.addHall("C", hallSeats, shows);
        mngr.addHall("D", hallSeats, shows);

        List<Hall> halls = mngr.getHalls();
        /* add list of cinema theatres */
        mngr.addCinemaTheatre("TH1", halls);
        mngr.addCinemaTheatre("TH2", halls);
        mngr.addCinemaTheatre("TH3", halls);

        List<CinemaTheatre> theatres = mngr.getCinemaTheatres();
        /* add list of cities */
        mngr.addCity("Kolkata", theatres);
        mngr.addCity("Bangalore", theatres);
        mngr.addCity("Delhi", theatres);
        mngr.addCity("Mumbai", theatres);


    }
}
