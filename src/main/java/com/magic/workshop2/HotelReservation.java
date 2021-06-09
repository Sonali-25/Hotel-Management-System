package com.magic.workshop2;
import java.util.*;
import java.text.SimpleDateFormat;

public class HotelReservation  {

    HotelInfo addHotel(String name , String type , int weekday) {
        return new HotelInfo(name , type , weekday);
    }
    private static int getDaysInBetween(String dateStarting , String dateEnding){

        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy");
        Date dateStart = new Date();
        try {
            dateStart = formatter.parse(dateStarting);
        } catch (Exception e) {
            //empty catch
        }
        Date dateEnd = new Date();
        try {
            dateEnd = formatter.parse(dateEnding);
        } catch (Exception e) {
            //empty catch
        }

        long difference = dateEnd.getTime() - dateStart.getTime();
        System.out.println(difference);
        int daysInBetween = (int) Math.ceil(difference / (1000 * 60 * 60 * 24));
        return daysInBetween;
    }

    private static Result getCheapestHotel(int daysInBetween , ArrayList<HotelInfo> hotelArray) {
        int currentHotelCost;
        for (HotelInfo currentHotel : hotelArray) {     // set weekday cost for each hotel
            currentHotelCost = daysInBetween * currentHotel.getWeekdayRate();
            currentHotel.setCostWeekDay(currentHotelCost);
        }
        // Optional<Hotel>
        Optional<HotelInfo> cheapestHotel = hotelArray.stream().min(Comparator.comparing(HotelInfo::getCostWeekday));
        Result result = new Result();
        result.setHotelName(cheapestHotel.get().getHotelName());
        result.setTotalCost(cheapestHotel.get().getCostWeekday());
        return result;
    }
    public Result findCheapestHotel(ArrayList<HotelInfo> hotelArray , String dateStarting , String dateEnding) {
        int daysInBetween = getDaysInBetween(dateStarting , dateEnding);
        Result cheapestHotel = getCheapestHotel(daysInBetween , hotelArray);
        System.out.println("Hotel Name: " + cheapestHotel.getHotelName() + " Total Rate is: " + cheapestHotel.getTotalCost());
        return cheapestHotel;
    }

}