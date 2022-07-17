package com.iweb.tourist;
//机票
public class Ticket {
    String tno;
    String startTime;
    String endTime;
    String sourcePlace;//起始地
    String targetPlace;//目的地
    String seatNo;//座位号

    public Ticket(String tno, String startTime, String targetPlace, String seatNo) {
        this.tno = tno;
        this.startTime = startTime;
        this.targetPlace = targetPlace;
        this.seatNo = seatNo;
    }

    public Ticket() {
    }
}
