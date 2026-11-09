package com.pluralsight;

public class Reservation {
    private String getRoomType;
    private String setRoomType;
    private double getPrice;
    private int getNumberOfNights;
    private int setNumberOfNights;
    private boolean weekend;

    public String getGetRoomType() {
        return getRoomType;
    }

    public void setGetRoomType(String getRoomType) {
        this.getRoomType = getRoomType;
    }

    public String getSetRoomType() {
        return setRoomType;
    }

    public void setSetRoomType(String setRoomType) {
        this.setRoomType = setRoomType;
    }

    public double getGetPrice() {
        return getPrice;
    }

    public void setGetPrice(double getPrice) {
        this.getPrice = getPrice;
    }

    public int getGetNumberOfNights() {
        return getNumberOfNights;
    }

    public void setGetNumberOfNights(int getNumberOfNights) {
        this.getNumberOfNights = getNumberOfNights;
    }

    public int getSetNumberOfNights() {
        return setNumberOfNights;
    }

    public void setSetNumberOfNights(int setNumberOfNights) {
        this.setNumberOfNights = setNumberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public boolean isSetWeekend() {
        return setWeekend;
    }

    public void setSetWeekend(boolean setWeekend) {
        this.setWeekend = setWeekend;
    }

    public String getGetReservationTotal() {
        return getReservationTotal;
    }

    public void setGetReservationTotal(String getReservationTotal) {
        this.getReservationTotal = getReservationTotal;
    }

    private boolean setWeekend;
    private String getReservationTotal;
}
