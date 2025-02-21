package com.springmvc.pmvc.controllers;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.springmvc.pmvc.beans.*;
import com.springmvc.pmvc.pmvcDAO.*;

@RestController
@RequestMapping("/course")
public class Course1Controller {

    @Autowired
    Course1DAO course1DAO;

    /**
     * Registers a new course.
     */
    @PostMapping("/register")
    public String registerCourse(@RequestBody Course1 course) {
        int result = course1DAO.save(course);
        return result > 0 ? "Course registered successfully!" : "Error registering course.";
    }

    /**
     * Retrieves all courses.
     */
    @GetMapping("/all")
    public List<Course1> getAllCourses() {
        return course1DAO.getCourses();
    }
}
