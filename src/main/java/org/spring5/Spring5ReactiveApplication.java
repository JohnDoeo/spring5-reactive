package org.spring5;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring5ReactiveApplication {

	public static void main(String[] args) throws IOException {
		System.out.println("spring boot project starting...");
		SpringApplication.run(Spring5ReactiveApplication.class, args);
	}

}
