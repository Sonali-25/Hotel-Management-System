package com.magic.workshop2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;



public class HotelReservationTest {
    @Test
    public void checkNameForHotel(){
        HotelReservation hotelReservation = new HotelReservation();
        HotelInfo newHotel = hotelReservation.addHotel("LakeWood","Regular",110,90,3);
        Assertions.assertEquals(newHotel.getHotelName(),"LakeWood");
    }
    @Test
    public void checkCustomerType(){
        HotelReservation hotelReservation = new HotelReservation();
        HotelInfo newHotel = hotelReservation.addHotel("LakeWood","Regular",110,90,3);
        Assertions.assertEquals(newHotel.getTypeOfCustomer(), "Regular");
    }
    @Test
    public void checkWeekRate(){
        HotelReservation hotelReservation = new HotelReservation();
        HotelInfo newHotel = hotelReservation.addHotel("LakeWood","Regular",110,90,3);
        Assertions.assertEquals(newHotel.getWeekdayRate(), 110);
    }
    @Test
    public void checkWeekendRate() {
        HotelReservation hotelReservation = new HotelReservation();
        HotelInfo newHotel = hotelReservation.addHotel("LakeWood", "Regular", 110, 90,3);
        Assertions.assertEquals(newHotel.getWeekendRate(), 90);
    }
    @Test
    public void checkCheapestHotelRate(){
        HotelReservation hotelReservation  = new HotelReservation();
        ArrayList <HotelInfo> HotelArray  = new ArrayList<>();
        HotelArray.add(hotelReservation.addHotel("LakeWood","Regular",110,90,3));
        HotelArray.add(hotelReservation.addHotel("RidgeWood","Regular",220,150,4));
        HotelArray.add(hotelReservation.addHotel("BridgeWood","Regular",150,50,5));
        Result cheapestHotel = hotelReservation.findCheapestHotel(HotelArray,"2020-09-10","2020-09-12");
        Assertions.assertEquals(310,cheapestHotel.getTotalCost());
    }
    @Test
    public void checkCheapestHotelForWeekend(){
        HotelReservation hotelReservation  = new HotelReservation();
        HotelInfo firstHotel = hotelReservation.addHotel("LakeWood","Regular",110,90,3);
        HotelInfo secondHotel = hotelReservation.addHotel("RidgeWood","Regular",160,50,4);
        HotelInfo thirdHotel = hotelReservation.addHotel("BridgeWood","Regular",220,150,5);
        Assertions.assertEquals(50,secondHotel.getWeekendRate());
    }

    @Test
    public void cheapestHotelForWeekdaysAndWeekend() {
        HotelReservation hotelReservation = new HotelReservation();
        ArrayList<HotelInfo> hotelArray = new ArrayList<>();
        hotelArray.add(hotelReservation.addHotel("LakeWood" , "Regular" , 110 , 90,3));
        hotelArray.add(hotelReservation.addHotel("BridgeWood" , "Regular" , 160 , 50,4));
        hotelArray.add(hotelReservation.addHotel("RidgeWood" , "Regular" , 220 , 150,5));
        Result cheapestHotel = hotelReservation.findCheapestHotel(hotelArray , "2020-09-11" , "2020-09-12");
        Assertions.assertEquals("LakeWood" , cheapestHotel.getHotelName());
    }
    @Test
    public void hotelRating(){
        HotelReservation hotelReservation = new HotelReservation();
        HotelInfo newHotel = hotelReservation.addHotel("BridgeWood" , "Regular" , 160 , 50,4);
        Assertions.assertEquals(4,newHotel.getRating());

    }
}
