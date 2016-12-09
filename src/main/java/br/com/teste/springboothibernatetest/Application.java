/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.teste.springboothibernatetest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.WebApplicationInitializer;

/**
 *
 * @author wagnerjl
 */
@ComponentScan
@SpringBootApplication
public class Application extends SpringBootServletInitializer implements WebApplicationInitializer {
	public static void main(final String... args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public SpringApplicationBuilder configure(final SpringApplicationBuilder builder) {
		return builder.sources(Application.class);
	}
}
