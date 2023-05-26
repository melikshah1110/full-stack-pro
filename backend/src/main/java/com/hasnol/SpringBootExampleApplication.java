package com.hasnol;

import com.github.javafaker.Faker;
import com.hasnol.customer.Customer;
import com.hasnol.customer.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Random;

@SpringBootApplication
public class SpringBootExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(CustomerRepository customerRepository) {
		return args -> {

			Faker faker = new Faker();
			Random random = new Random();

			Customer customer = new Customer(
					faker.name().fullName(),
					faker.internet().safeEmailAddress(),
					random.nextInt(16,99)
			);

			customerRepository.save(customer);

		};
	}

}
