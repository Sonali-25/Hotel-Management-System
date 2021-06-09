package com.magic.workshop2;

public class HotelReservation {
    HotelInfo addHotel(String hotelName, String typeOfCustomer, int weekRate, int weekendRate){
        return new HotelInfo(hotelName,typeOfCustomer,weekRate,weekendRate);
    }
}
