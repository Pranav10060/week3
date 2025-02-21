package com.springmvc.pmvc.pmvcDAO;

import java.sql.*;
import java.util.*;
import org.springframework.jdbc.core.*;
import com.springmvc.pmvc.beans.*;

public class FacultyCourseDAO {

    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * Assigns a course to a faculty.
     */
    public int assignCourseToFaculty(int facultyId, int courseId) {
        String qry = "INSERT INTO Faculty_Courses (faculty_id, course_id) VALUES (?, ?)";
        return jdbcTemplate.update(qry, facultyId, courseId);
    }

    /**
     * Retrieves assigned courses for a faculty.
     */
    public List<Course1> getCoursesByFacultyId(int facultyId) {
        String qry = "SELECT c.id, c.name, c.duration FROM Course1 c "
                     + "JOIN Faculty_Courses fc ON c.id = fc.course_id "
                     + "WHERE fc.faculty_id = ?";
        
        return jdbcTemplate.query(qry, new Object[]{facultyId}, (rs, rowNum) -> 
            new Course1(rs.getInt("id"), rs.getString("name"), rs.getString("duration"))
        );
    }
}
