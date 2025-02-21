package com.springmvc.pmvc.config;

import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * WebMvcConfig class handles Spring MVC configuration.
 * It replaces XML-based configuration and sets up view resolvers and static resources.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.springmvc.pmvc.controller") // Scans controller package
public class WebMvcConfig implements WebMvcConfigurer {

    /**
     * Configures the View Resolver to resolve JSP pages.
     * @return InternalResourceViewResolver instance.
     */
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/"); // Location of JSP files
        resolver.setSuffix(".jsp"); // Suffix for JSP pages
        return resolver;
    }

    /**
     * Configures static resource handling for CSS, JS, and images.
     * @param registry The ResourceHandlerRegistry object.
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
}
