package com.uabc.edu.appswbd.demo_examen.securingweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/list-employees.html").setViewName("list-employees.html");
        registry.addViewController("/").setViewName("list-employees.html");
        registry.addViewController("/add-edit-employee.html").setViewName("add-edit-employee.html");
        registry.addViewController("/login").setViewName("login");
    }

}