package com.codeclan.example.BookingsSystem.repositories;

import com.codeclan.example.BookingsSystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking,Long> {

    List<Booking> findAllByDate(String date);
}
