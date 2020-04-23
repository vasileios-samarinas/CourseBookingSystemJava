package com.codeclan.example.BookingsSystem.controllers;


import com.codeclan.example.BookingsSystem.models.Course;
import com.codeclan.example.BookingsSystem.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses(){

        return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Course> getCourse(@PathVariable Long id) {
        return new ResponseEntity(courseRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Course> postCourse(@RequestBody Course course){
        courseRepository.save(course);
        return new ResponseEntity<>(course, HttpStatus.CREATED);
    }

    @PutMapping(value="/{id}")
    public ResponseEntity<Course> putCourse(@RequestBody Course course){
        courseRepository.save(course);
        return new ResponseEntity<>(course, HttpStatus.OK);
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<Long> deleteCourse(@PathVariable Long id){
        courseRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

}
