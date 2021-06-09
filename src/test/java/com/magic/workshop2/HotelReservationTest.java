package com.magic.workshop2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;



public class HotelReservationTest {
    @Test
    public void checkNameForHotel(){
        HotelReservation hotelReservation = new HotelReservation();
        HotelInfo newHotel = hotelReservation.addHotel("LakeWood","Regular",110);
        Assertions.assertEquals(newHotel.getHotelName(),"LakeWood");
    }
    @Test
    public void checkCustomerType(){
        HotelReservation hotelReservation = new HotelReservation();
        HotelInfo newHotel = hotelReservation.addHotel("LakeWood","Regular",110);
        Assertions.assertEquals(newHotel.getTypeOfCustomer(), "Regular");
    }
    @Test
    public void checkWeekRate(){
        HotelReservation hotelReservation = new HotelReservation();
        HotelInfo newHotel = hotelReservation.addHotel("LakeWood","Regular",110);
        Assertions.assertEquals(newHotel.getWeekdayRate(), 110);
    }

    @Test
    public void checkCheapestHotel(){
        HotelReservation hotelReservation  = new HotelReservation();
        ArrayList <HotelInfo> HotelArray  = new ArrayList<>();
        HotelArray.add(hotelReservation.addHotel("LakeWood","Regular",110));
        HotelArray.add(hotelReservation.addHotel("RidgeWood","Regular",220));
        HotelArray.add(hotelReservation.addHotel("BridgeWood","Regular",150));
        Result cheapestHotel = hotelReservation.findCheapestHotel(HotelArray,"10092020","12092020");
        Assertions.assertEquals(220,cheapestHotel.getTotalCost());
    }
}
