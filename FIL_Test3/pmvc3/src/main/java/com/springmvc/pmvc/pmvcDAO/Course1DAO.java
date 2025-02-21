package com.springmvc.pmvc.pmvcDAO;

import java.sql.*;
import java.util.*;
import org.springframework.jdbc.core.*;
import com.springmvc.pmvc.beans.*;

public class Course1DAO {

    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * Registers a new course in the database.
     */
    public int save(Course1 c) {
        String qry = "INSERT INTO Course1 (id, name, duration) VALUES (?, ?, ?)";
        return jdbcTemplate.update(qry, c.getId(), c.getName(), c.getDuration());
    }

    /**
     * Retrieves all courses.
     */
    public List<Course1> getCourses() {    
        return jdbcTemplate.query("SELECT * FROM Course1", (rs, rowNum) -> 
            new Course1(rs.getInt("id"), rs.getString("name"), rs.getString("duration"))
        );
    }
}
