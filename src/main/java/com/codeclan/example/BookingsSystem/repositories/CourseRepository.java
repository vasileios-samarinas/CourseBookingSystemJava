package com.codeclan.example.BookingsSystem.repositories;

import com.codeclan.example.BookingsSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CourseRepository extends JpaRepository<Course, Long> {
    public List<Course> findCoursesByStarRating(int rating);
    public List<Course> findAllByBookingsCustomerId(Long customerId);

}
