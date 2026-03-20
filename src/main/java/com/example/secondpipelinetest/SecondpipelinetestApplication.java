package com.example.secondpipelinetest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecondpipelinetestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SecondpipelinetestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Applicatoin is UP and RUNNING...");
	}
}
