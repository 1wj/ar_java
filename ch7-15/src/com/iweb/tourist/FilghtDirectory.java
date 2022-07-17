package com.iweb.tourist;
//航班目录
public class FilghtDirectory {
    String fdno;
    String fdname;
    String airplaneModel;
    String startTime;
    String endTime;
    String sourcePlace;//起始地
    String targetPlace;//目的地

    public FilghtDirectory(String fdname, String startTime, String sourcePlace, String targetPlace) {
        this.fdname = fdname;
        this.startTime = startTime;
        this.sourcePlace = sourcePlace;
        this.targetPlace = targetPlace;
    }

    public FilghtDirectory() {
    }
}
