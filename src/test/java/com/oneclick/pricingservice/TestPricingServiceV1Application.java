package com.oneclick.pricingservice;

import org.springframework.boot.SpringApplication;

public class TestPricingServiceV1Application {

	public static void main(String[] args) {
		SpringApplication.from(PricingServiceV1Application::main).with(TestcontainersConfiguration.class).run(args);
	}

}
