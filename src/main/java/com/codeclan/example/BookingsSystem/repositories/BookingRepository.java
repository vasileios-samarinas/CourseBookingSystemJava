package com.codeclan.example.BookingsSystem.repositories;

import com.codeclan.example.BookingsSystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Long> {
}
