package com.springmvc.pmvc;

import org.apache.catalina.startup.Tomcat;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import com.springmvc.pmvc.config.AppConfig;
import com.springmvc.pmvc.config.WebMvcConfig;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.io.File;

/**
 * This class initializes and runs the Spring MVC application with an embedded Tomcat server.
 */
public class Application implements WebApplicationInitializer {

    public static void main(String[] args) throws Exception {
        // Create embedded Tomcat server
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080); // Set server port

        // Set base directory for temporary files
        File baseDir = new File(System.getProperty("java.io.tmpdir"));
        tomcat.setBaseDir(baseDir.getAbsolutePath());

        // Add Web Application Context
        tomcat.addWebapp("/", baseDir.getAbsolutePath());

        // Start Tomcat
        tomcat.start();
        System.out.println("🚀 Application is running at http://localhost:8080/");
        tomcat.getServer().await();
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        // Create Spring Application Context
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(AppConfig.class, WebMvcConfig.class);
        context.setServletContext(servletContext);

        // Register DispatcherServlet
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("springDispatcher",
                new DispatcherServlet(context));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }
}
