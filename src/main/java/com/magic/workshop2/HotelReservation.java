package com.magic.workshop2;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.Duration;
import java.time.LocalDate;


public class HotelReservation {

    HotelInfo addHotel(String name , String type , int weekday , int weekend,int rating) {
        return new HotelInfo(name , type , weekday ,weekend,rating);
    }
    public Result findCheapestHotel(ArrayList<HotelInfo> hotelArray , String dateS , String dateE) {

        Integer cost;
        LocalDate dateStart = null , dateEnd = null;

        try {
            dateStart = LocalDate.parse(dateS);
        } catch (Exception e) {
            System.out.println("Please enter proper starting date");
        }
        try {
            dateEnd = LocalDate.parse(dateE);
        } catch (Exception e) {
            System.out.println("Please enter proper ending date");
        }
        long difference = Duration.between(dateStart.atStartOfDay() , dateEnd.atStartOfDay()).toDays();

        for(HotelInfo hotelInfo : hotelArray) {
            cost = hotelInfo.getTotalRate(dateStart, dateEnd, difference);
            hotelInfo.setTotalCost(cost);
        }
        return this.getCheapestHotel(hotelArray);
    }

    public Result getCheapestHotel(ArrayList<HotelInfo> hotelArray){
        Optional<HotelInfo> cheapestHotel = hotelArray.stream().min(Comparator.comparingInt(hotel -> hotel.getTotalCost()));
        Result result = new Result();
        result.setHotelName(cheapestHotel.get().getHotelName());
        result.setTotalCost(cheapestHotel.get().getTotalCost());
        System.out.println(result.getHotelName() + " " + result.getTotalCost());
        return result;
    }
    public Result cheapestBestRatedHotel(ArrayList<HotelInfo> hotelArray , Result result) {
        Optional<HotelInfo> maxCostHotel = hotelArray.stream().max(Comparator.comparingInt(hotel -> hotel.getTotalCost()));
        Optional<HotelInfo> minRatingHotel = hotelArray.stream().min(Comparator.comparingInt(hotel -> hotel.getRating()));
        for (HotelInfo hotel : hotelArray) {
            if (hotel.getTotalCost() < maxCostHotel.get().getTotalCost() && hotel.getRating() > minRatingHotel.get().getRating()) {
                result.setRating(hotel.getRating());
                result.setHotelName(hotel.getHotelName());
                result.setTotalCost(hotel.getTotalCost());
            }
        }
        return result;
    }

}


