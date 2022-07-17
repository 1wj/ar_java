package com.iweb.tourist;

/**
 * 旅客可以联系旅行社帮忙订机票
 * 旅行社首先查询航班目标
 * 旅行社为该旅客订一张机票
 * 旅行社将改机票送至旅客手中
 */
//旅行社
public class LvShe {
    String tsno;
    String tname;
    String address;

    public LvShe(String tsno, String tname) {
        this.tsno = tsno;
        this.tname = tname;
    }

    public LvShe() {
    }

    void queryFilght(FilghtDirectory fd){
        System.out.println(tname+"首先查阅了"+fd.fdname+"的航班目录"+
        "这一架次的信息，时间："+fd.startTime+",起始地："+fd.sourcePlace+",目的地"+
        fd.targetPlace);
    }

    void dingPiao(Tour t,Ticket ticket){
        System.out.println(tname+"为"+t.cname+"定了一张编号为"+ticket.tno+
                "的机票，该机票信息为，时间："+ticket.startTime+
                "目的地"+ticket.targetPlace+",座位号："+ticket.seatNo);
    }
    void sendTicket(Ticket ticket,Tour t){
        System.out.println(tname+"将机票："+ticket.tno+"送至"+t.cname+"手中");
    }
}
