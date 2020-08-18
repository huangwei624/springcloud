package com.lovestudy.zuul9099;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class Zuul9099Application {

	public static void main(String[] args) {
		SpringApplication.run(Zuul9099Application.class, args);
	}

}
