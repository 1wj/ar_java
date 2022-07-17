package com.iweb.tourist;

public class Tour {
    String cname;
    String cno;

    public Tour() {
    }

    public Tour(String cname, String cno) {
        this.cname = cname;
        this.cno = cno;
    }

    void lianXi(LvShe lv, TravelInfo ti){
        System.out.println(cname+"正在联系"+lv.tname+",告知想要预定一张信息为"+
                ti.travelTime+"由"+ ti.sourcePlace+"到"+ti.targetPlace+"的机票");

    }
}
