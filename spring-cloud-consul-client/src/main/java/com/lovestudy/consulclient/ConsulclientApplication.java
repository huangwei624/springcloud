package com.lovestudy.consulclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulclientApplication {
	public static void main(String[] args){
		SpringApplication.run(ConsulclientApplication.class, args);
	}
}
