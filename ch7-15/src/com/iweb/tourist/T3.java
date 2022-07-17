package com.iweb.tourist;

public class T3 {
    public static void main(String[] args) {
        LvShe ls=new LvShe("185","中国旅行社");
        Tour t=new Tour("张三","51616511");
        TravelInfo ti=new TravelInfo("北京","上海","2020-1-1");
        FilghtDirectory fi=new FilghtDirectory("明航","2020-1-1","北京","上海");
        Ticket tic=new Ticket("8494","2020-1-1","上海","8排");



        t.lianXi(ls,ti);//联系旅社
        ls.queryFilght(fi);//查航班信息
        ls.dingPiao(t,tic);//订票
        ls.sendTicket(tic,t);//送票

    }
}
