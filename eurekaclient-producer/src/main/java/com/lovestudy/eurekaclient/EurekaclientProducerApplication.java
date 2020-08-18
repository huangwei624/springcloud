package com.lovestudy.eurekaclient;

import com.alibaba.fastjson.JSONObject;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableHystrix
@EnableHystrixDashboard
public class EurekaclientProducerApplication {
	
	@Value("${server.port}")
	private int port;
	
	@Value("${eureka.instance.hostname}")
	private String host;

	public static void main(String[] args) {
		SpringApplication.run(EurekaclientProducerApplication.class, args);
	}
	
	@HystrixCommand(fallbackMethod = "errorFallback")
	@GetMapping("/list33")
	public Object list3(){
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("host", this.host);
		jsonObject.put("port", this.port);
		jsonObject.put("id", 1);
		jsonObject.put("name", "huangwei");
		jsonObject.put("age", 24);
		jsonObject.put("addr", "上海");
		return jsonObject.toJSONString();
	}
	
	public String errorFallback() {
		return "方法list发生了错误！";
	}
	
	@GetMapping("/list44")
	public Object list4(){
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("host", this.host);
		jsonObject.put("port", this.port);
		jsonObject.put("id", 1);
		jsonObject.put("name", "huangwei");
		jsonObject.put("age", 24);
		jsonObject.put("addr", "上海");
		return jsonObject.toJSONString();
	}

}
