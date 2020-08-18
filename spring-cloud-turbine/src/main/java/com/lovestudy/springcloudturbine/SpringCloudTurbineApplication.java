package com.lovestudy.springcloudturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
@EnableTurbine
public class SpringCloudTurbineApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTurbineApplication.class, args);
	}
	
}
