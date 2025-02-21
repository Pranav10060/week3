package com.springmvc.pmvc.controllers;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.springmvc.pmvc.pmvcDAO.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    FacultyCourseDAO facultyCourseDAO;

    /**
     * Assigns a course to a faculty member.
     */
    @PostMapping("/assignCourse")
    public String assignCourse(@RequestParam int facultyId, @RequestParam int courseId) {
        int result = facultyCourseDAO.assignCourseToFaculty(facultyId, courseId);
        return result > 0 ? "Course assigned successfully!" : "Error assigning course.";
    }
}
