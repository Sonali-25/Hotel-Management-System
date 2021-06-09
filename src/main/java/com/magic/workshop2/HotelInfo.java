package com.magic.workshop2;

public class HotelInfo{
    private String hotelName;
    private String typeOfCustomer;
    private int weekdayRate;
    public int costWeekday;
    private int weekendRate;

    public HotelInfo(){

    }

    public HotelInfo(String hotelName, String typeOfCustomer, int weekdayRate,int weekendRate) {
        this.hotelName = hotelName;
        this.typeOfCustomer = typeOfCustomer;
        this.weekdayRate = weekdayRate;
        this.weekendRate = weekendRate;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public int getWeekdayRate() {
        return weekdayRate;
    }

    public int getCostWeekday() {
        return  costWeekday;
    }

    public void setCostWeekDay(int costWeekday) {
        this.costWeekday = costWeekday;
    }

    public int getWeekendRate() {
        return weekendRate;
    }

    public void setWeekendRate(int weekendRate) {
        this.weekendRate = weekendRate;
    }
}