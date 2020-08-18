package com.lovestudy.feignclient9095;

import com.lovestudy.feignclient9095.feign.HelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
@RestController
public class FeignClient9095Application {
	
	@Autowired
	private HelloFeign helloFeign;

	public static void main(String[] args) {
		SpringApplication.run(FeignClient9095Application.class, args);
	}

	@GetMapping("/list")
	public Object list() {
		return helloFeign.list();
	}
	
}
