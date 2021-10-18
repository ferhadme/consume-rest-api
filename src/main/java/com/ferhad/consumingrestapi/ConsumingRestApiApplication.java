package com.ferhad.consumingrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConsumingRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumingRestApiApplication.class, args);
	}

	@Bean
	public FakeUserConsumer fakeUserConsumer() {
		return new FakeUserConsumer();
	}

}
