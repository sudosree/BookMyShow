package com.bookmyshow.booking;

import com.bookmyshow.payment.Payment;
import com.bookmyshow.user.User;
import com.bookmyshow.show.Show;
import com.bookmyshow.show.ShowSeat;

import java.util.List;

public class Booking {

    private User user;
    private String bookingId;
    private Show show;
    private List<ShowSeat> showSeat;
    private Payment payment;
    private Invoice invoice;

    public Booking(User user, String bookingId, Show show, List<ShowSeat> showSeat, Payment payment) {
        this.user = user;
        this.bookingId = bookingId;
        this.show = show;
        this.showSeat = showSeat;
        this.payment = payment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public List<ShowSeat> getShowSeat() {
        return showSeat;
    }

    public void setShowSeat(List<ShowSeat> showSeat) {
        this.showSeat = showSeat;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
