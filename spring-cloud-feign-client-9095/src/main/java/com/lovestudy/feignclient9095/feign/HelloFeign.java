package com.lovestudy.feignclient9095.feign;

import com.lovestudy.feignclient9095.FallBackHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "EUREKACLIENT-PRODUCER", fallback = FallBackHystrix.class)
public interface HelloFeign {
	
	@GetMapping("/list")
	String list();
}
