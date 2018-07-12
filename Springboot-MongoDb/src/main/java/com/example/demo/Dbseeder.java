package com.example.demo;

import org.assertj.core.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Dbseeder implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		 Hotel marriot = new Hotel(
	                "Marriot",
	                130,
	                new Address("Paris", "France"),
	                Arrays.asList(
	                        new Review("John", 8, false),
	                        new Review("Mary", 7, true)
	                )
	);
		
	}

	
	
}
