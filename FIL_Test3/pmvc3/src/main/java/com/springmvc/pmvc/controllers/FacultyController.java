package com.springmvc.pmvc.controllers;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.springmvc.pmvc.beans.*;
import com.springmvc.pmvc.pmvcDAO.*;

@RestController
@RequestMapping("/faculty")
public class FacultyController {

    @Autowired
    FacultyDAO facultyDAO;

    @Autowired
    FacultyCourseDAO facultyCourseDAO;

    /**
     * Registers a faculty.
     */
    @PostMapping("/register")
    public String registerFaculty(@RequestBody Faculty faculty) {
        int result = facultyDAO.save(faculty);
        return result > 0 ? "Faculty registered successfully!" : "Error registering faculty.";
    }

    /**
     * Faculty login and fetch assigned courses.
     */
    @PostMapping("/login")
    public Map<String, Object> login(@RequestParam String email, @RequestParam String password) {
        Faculty faculty = facultyDAO.getFacultyByEmail(email);
        if (faculty != null && faculty.getPass().equals(password)) {
            List<Course1> assignedCourses = facultyCourseDAO.getCoursesByFacultyId(faculty.getId());

            Map<String, Object> response = new HashMap<>();
            response.put("faculty", faculty);
            response.put("assignedCourses", assignedCourses);
            return response;
        }
        throw new RuntimeException("Invalid email or password!");
    }
}
