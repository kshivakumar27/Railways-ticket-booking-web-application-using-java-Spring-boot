package com.ltts.projecttrain;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


//@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class})

@SpringBootApplication
public class ProjecttrainApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ProjecttrainApplication.class, args);
	}

}
