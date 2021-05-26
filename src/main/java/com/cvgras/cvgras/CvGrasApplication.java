package com.cvgras.cvgras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class CvGrasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CvGrasApplication.class, args);
	}

}
