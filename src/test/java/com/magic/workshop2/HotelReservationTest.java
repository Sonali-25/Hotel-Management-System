package com.magic.workshop2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;



public class HotelReservationTest {
    @Test
    public void checkNameForHotel(){
        HotelReservation hotelReservation = new HotelReservation();
        HotelInfo newHotel = hotelReservation.addHotel("LakeWood","Regular",110,90);
        Assertions.assertEquals(newHotel.getHotelName(),"LakeWood");
    }
    @Test
    public void checkCustomerType(){
        HotelReservation hotelReservation = new HotelReservation();
        HotelInfo newHotel = hotelReservation.addHotel("LakeWood","Regular",110,90);
        Assertions.assertEquals(newHotel.getTypeOfCustomer(), "Regular");
    }
    @Test
    public void checkWeekRate(){
        HotelReservation hotelReservation = new HotelReservation();
        HotelInfo newHotel = hotelReservation.addHotel("LakeWood","Regular",110,90);
        Assertions.assertEquals(newHotel.getWeekdayRate(), 110);
    }
    @Test
    public void checkWeekendRate() {
        HotelReservation hotelReservation = new HotelReservation();
        HotelInfo newHotel = hotelReservation.addHotel("LakeWood", "Regular", 110, 90);
        Assertions.assertEquals(newHotel.getWeekendRate(), 90);
    }
    @Test
    public void checkCheapestHotelForWeekdays(){
        HotelReservation hotelReservation  = new HotelReservation();
        ArrayList <HotelInfo> HotelArray  = new ArrayList<>();
        HotelArray.add(hotelReservation.addHotel("LakeWood","Regular",110,90));
        HotelArray.add(hotelReservation.addHotel("RidgeWood","Regular",220,150));
        HotelArray.add(hotelReservation.addHotel("BridgeWood","Regular",150,50));
        Result cheapestHotel = hotelReservation.findCheapestHotel(HotelArray,"10092020","12092020");
        Assertions.assertEquals(220,cheapestHotel.getTotalCost());
    }
    @Test
    public void checkCheapestHotelForWeekend(){
        HotelReservation hotelReservation  = new HotelReservation();
        HotelInfo firstHotel = hotelReservation.addHotel("LakeWood","Regular",110,90);
        HotelInfo secondHotel = hotelReservation.addHotel("RidgeWood","Regular",160,50);
        HotelInfo thirdHotel = hotelReservation.addHotel("BridgeWood","Regular",220,150);
        Assertions.assertEquals(50,secondHotel.getWeekendRate());


    }
}
