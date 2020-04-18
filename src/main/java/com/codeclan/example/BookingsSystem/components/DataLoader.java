package com.codeclan.example.BookingsSystem.components;

import com.codeclan.example.BookingsSystem.models.Booking;
import com.codeclan.example.BookingsSystem.models.Course;
import com.codeclan.example.BookingsSystem.models.Customer;
import com.codeclan.example.BookingsSystem.repositories.BookingRepository;
import com.codeclan.example.BookingsSystem.repositories.CourseRepository;
import com.codeclan.example.BookingsSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;
    @Autowired
    BookingRepository bookingRepository;
    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {}

    public void run(ApplicationArguments args) {

        Course course1 = new Course("Intro To Python", "London",5);
        courseRepository.save(course1);

        Course course2 = new Course("Java Advanced Lesson", "Manchester",4);
        courseRepository.save(course2);

        Customer customer1 = new Customer("Max", "Napoli", 32);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Jeff", "Athens", 41);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Jackie", "San Francisco", 40);
        customerRepository.save(customer3);

        Customer customer4 = new Customer("Eric", "Athens", 55);
        customerRepository.save(customer4);

        // Max booked Intro to Python on xmas eve
        Booking booking1 = new Booking("24-12-2018", customer1, course1);
        bookingRepository.save(booking1);

        // Jeff booked Java Advanced lesson on xmas eve
        Booking booking2 = new Booking("24-12-2018", customer2, course2);
        bookingRepository.save(booking2);

        // Jackie booked Java Advanced Lesson on 17th November
        Booking booking3 = new Booking("17-11-2019", customer3, course2);
        bookingRepository.save(booking3);

        //Eric booked Java Advanced Lesson on xmas eve
        Booking booking4  = new Booking("24-12-2018", customer4, course2);
        bookingRepository.save(booking4);

    }
}

