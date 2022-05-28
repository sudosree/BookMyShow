package com.bookmyshow.show;

import com.bookmyshow.seat.HallSeat;

public class ShowSeat {

    private String id;
    private HallSeat hallSeat;
    private Status status;

    public ShowSeat(String id, HallSeat hallSeat, Status status) {
        this.id = id;
        this.hallSeat = hallSeat;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HallSeat getSeat() {
        return hallSeat;
    }

    public void setSeat(HallSeat hallSeat) {
        this.hallSeat = hallSeat;
    }

    public Status isStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
