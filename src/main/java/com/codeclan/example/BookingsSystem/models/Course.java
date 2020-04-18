package com.codeclan.example.BookingsSystem.models;

import java.util.List;

public class Course {

    private String name;

    private String town;

    private int starRating;

    private List<Booking> bookings;

    public Course(String name, String town, int starRating) {
        this.name = name;
        this.town = town;
        this.starRating = starRating;
    }

}
