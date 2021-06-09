package com.magic.workshop2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {
    @Test
    public void checkNameForHotel(){
        HotelReservation hotelReservation = new HotelReservation();
        HotelInfo newHotel = hotelReservation.addHotel("Lakewood","Regular",110,90);
        Assertions.assertEquals(newHotel.hotelName,"Lakewood");
    }
    @Test
    public void checkCustomerType(){
        HotelReservation hotelReservation = new HotelReservation();
        HotelInfo newHotel = hotelReservation.addHotel("Lakewood","Regular",110,90);
        Assertions.assertEquals(newHotel.typeOfCustomer, "Regular");
    }
    @Test
    public void checkWeekRate(){
        HotelReservation hotelReservation = new HotelReservation();
        HotelInfo newHotel = hotelReservation.addHotel("Lakewood","Regular",110,90);
        Assertions.assertEquals(newHotel.weekRate, 110);
    }
    @Test
    public void checkWeekendRate(){
        HotelReservation hotelReservation = new HotelReservation();
        HotelInfo newHotel = hotelReservation.addHotel("Lakewood","Regular",110,90);
        Assertions.assertEquals(newHotel.weekendRate,90);
    }
}
