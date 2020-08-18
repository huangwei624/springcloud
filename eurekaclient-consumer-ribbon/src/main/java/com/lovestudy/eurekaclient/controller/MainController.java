package com.lovestudy.eurekaclient.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	private final String producerServiceName = "http://EUREKACLIENT-PRODUCER";
	
	
	@HystrixCommand(fallbackMethod = "listError")
	@GetMapping("/list")
	public Object list() {
		return restTemplate.getForObject(this.producerServiceName + "/list", String.class);
	}
	
	
	@HystrixCommand(fallbackMethod = "listError")
	@GetMapping("/list2")
	public Object list2() {
		return restTemplate.getForObject(this.producerServiceName + "/list", String.class);
	}
	
	/**
	 * fallback函数
	 * @return
	 */
	public String listError() {
		return "消费者在请求：" + this.producerServiceName+"/list 接口时出现超时";
	}
}

