package com.springmvc.pmvc.pmvcDAO;

import java.sql.*;
import java.util.*;
import org.springframework.jdbc.core.*;
import com.springmvc.pmvc.beans.*;

public class FacultyDAO {

    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * Registers a new faculty in the database.
     */
    public int save(Faculty f) {
        String qry = "INSERT INTO Faculty (id, name, email, pass, mobile) VALUES (?, ?, ?, ?, ?)";
        return jdbcTemplate.update(qry, f.getId(), f.getName(), f.getEmail(), f.getPass(), f.getMobile());
    }

    /**
     * Fetches faculty details by email for login.
     */
    public Faculty getFacultyByEmail(String email) {
        String qry = "SELECT * FROM Faculty WHERE email = ?";
        return jdbcTemplate.queryForObject(qry, new Object[]{email}, (rs, rowNum) -> 
            new Faculty(rs.getInt("id"), rs.getString("name"), rs.getString("email"),
                        rs.getString("pass"), rs.getString("mobile"))
        );
    }
}
