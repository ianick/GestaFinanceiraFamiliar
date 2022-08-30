package com.gestaFinanceiraFamiliar.GestaFinanceiraFamiliar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class GestaFinanceiraFamiliarApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaFinanceiraFamiliarApplication.class, args);
	}

}
