package com.magic.workshop2;

public class HotelInfo{
    private String hotelName;
    private String typeOfCustomer;
    private int weekdayRate;
    public int costWeekday;

    public HotelInfo(){

    }

    public HotelInfo(String hotelName, String typeOfCustomer, int weekdayRate) {
        this.hotelName = hotelName;
        this.typeOfCustomer = typeOfCustomer;
        this.weekdayRate = weekdayRate;
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
}