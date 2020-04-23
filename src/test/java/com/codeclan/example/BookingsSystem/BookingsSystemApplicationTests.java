package com.codeclan.example.BookingsSystem;

import com.codeclan.example.BookingsSystem.models.Booking;
import com.codeclan.example.BookingsSystem.models.Course;
import com.codeclan.example.BookingsSystem.repositories.BookingRepository;
import com.codeclan.example.BookingsSystem.repositories.CourseRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
class BookingsSystemApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void canFindAllCourses(){
		List<Course> found = courseRepository.findAll();
		assertEquals(2, found.size());
	}

	@Test
	public void canGetAllBookingsForDate(){
		List<Booking> found = bookingRepository.findAllByDate("24-12-2018");
		assertEquals(3, found.size());
	}

	public void canGetCoursesForStarRating(){
		List<Course> found = courseRepository.findCoursesByStarRating(5);
		assertEquals(1, found.size());
		assertEquals("Intro To Python", found.get(0).getName());
	}



}
