package com.kce.service;

import java.util.ArrayList;
import com.kce.bean.Taxi;
import com.kce.bean.Bookingtaxi;

public class Call_taxiservice {

    ArrayList<Taxi> taxis = new ArrayList<>();
    ArrayList<Bookingtaxi> bookings = new ArrayList<>();
    int bookingId = 1;

    public Call_taxiservice() {

        for (int i = 1; i <= 4; i++) {
            Taxi t = new Taxi();
            t.setTaxiId(i);
            t.setTotalEarnings(0);
            taxis.add(t);
        }
    }

    public void bookTaxi(int customerId, char from, char to, int pickupTime) {

        Taxi selected = taxis.get(0);  e

        int distance = Math.abs(from - to);
        int km = distance * 15;
        int dropTime = pickupTime + distance;

        int amount = 100;
        if (km > 5) {
            amount = 100 + (km - 5) * 10;
        }
     Bookingtaxi b = new Bookingtaxi();

        b.setBookingId(bookingId++);
        b.setCustomerId(customerId);
        b.setFrom(from);
        b.setTo(to);
        b.setPickupTime(pickupTime);
        b.setDropTime(dropTime);
        b.setAmount(amount);
        b.setTaxiId(selected.getTaxiId());

        bookings.add(b);
        selected.setTotalEarnings(
                selected.getTotalEarnings() + amount
        );

        System.out.println("Taxi can be allotted. Taxi-" +
                selected.getTaxiId() + " is allotted.");
    }

    public void display() {

        for (Taxi t : taxis) {

            System.out.println("\nTaxi-" + t.getTaxiId() +
                    " Total Earnings: Rs. " + t.getTotalEarnings());

            System.out.println("BookingID CustomerID From To Pickup Drop Amount");

            for (Bookingtaxi b : bookings) {

                if (b.getTaxiId() == t.getTaxiId()) {

                    System.out.println(
                            b.getBookingId() + "   " +
                            b.getCustomerId() + "   " +
                            b.getFrom() + "   " +
                            b.getTo() + "   " +
                            b.getPickupTime() + "   " +
                            b.getDropTime() + "   " +
                            b.getAmount()
                    );
                }
            }
        }
    }
}