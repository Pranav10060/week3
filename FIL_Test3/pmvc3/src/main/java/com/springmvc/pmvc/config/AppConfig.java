package com.springmvc.pmvc.config;

import javax.sql.DataSource;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * AppConfig class handles the Spring application configuration.
 * It replaces the XML-based configuration and sets up the database.
 */
@Configuration
@ComponentScan(basePackages = "com.springmvc.pmvc")
public class AppConfig {

    /**
     * Configures the MySQL DataSource for database connections.
     * @return DataSource object with MySQL connection properties.
     */
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/fil_db1"); // Change DB Name If Needed
        dataSource.setUsername("root");  // Change If You Have Different Credentials
        dataSource.setPassword("Pranav@123"); // Set Your MySQL Password
        return dataSource;
    }

    /**
     * Registers JdbcTemplate Bean for executing SQL queries.
     * @param dataSource Injected DataSource object.
     * @return JdbcTemplate instance.
     */
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
