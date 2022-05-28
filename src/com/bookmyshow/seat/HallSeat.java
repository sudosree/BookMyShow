package com.bookmyshow.seat;

import com.bookmyshow.show.ShowSeat;

import java.util.List;

public class HallSeat {

    private int seatNo;
    private List<ShowSeat> showSeats;

    public HallSeat(int seatNo) {
        this.seatNo = seatNo;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

}
