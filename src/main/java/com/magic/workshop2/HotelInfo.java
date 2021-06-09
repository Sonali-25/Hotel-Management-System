package com.magic.workshop2;

public class HotelInfo {
    String hotelName;
    String typeOfCustomer;
    int weekRate;
    int weekendRate;

    public HotelInfo(String hotelName, String typeOfCustomer, int weekRate, int weekendRate) {
        this.hotelName = hotelName;
        this.typeOfCustomer = typeOfCustomer;
        this.weekRate = weekRate;
        this.weekendRate = weekendRate;
    }
}
