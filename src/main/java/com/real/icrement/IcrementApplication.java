package com.real.icrement;

import org.modelmapper.ModelMapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class IcrementApplication {

	public static void main(String[] args) {
		SpringApplication.run(IcrementApplication.class, args);
	}
	
	 @Bean
	    public ModelMapper modelMapper() {
	        return new ModelMapper();
	    }

}
//https://spring.io/guides/gs/accessing-data-mysql/