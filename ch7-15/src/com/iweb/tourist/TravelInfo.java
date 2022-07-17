package com.iweb.tourist;
//出行信息
public class TravelInfo {
    String sourcePlace;
    String targetPlace;
    String travelTime;

    public TravelInfo() {
    }

    public TravelInfo(String sourcePlace, String targetPlace, String travelTime) {
        this.sourcePlace = sourcePlace;
        this.targetPlace = targetPlace;
        this.travelTime = travelTime;
    }
}
