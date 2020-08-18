package com.lovestudy.feignclient9095;

import com.lovestudy.feignclient9095.feign.HelloFeign;
import org.springframework.stereotype.Component;

@Component
public class FallBackHystrix implements HelloFeign {
	@Override
	public String list() {
		return "在请求服务：EUREKACLIENT-PRODUCER/list 接口时出现异常！";
	}
}
