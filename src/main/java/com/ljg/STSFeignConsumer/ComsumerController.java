package com.ljg.STSFeignConsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComsumerController {

	@Autowired
	HelloService helloService;
	
	@RequestMapping(value="/feign-consumer", method=RequestMethod.GET)
	public String helloConsumer() {
		return helloService.hello();
	}
}
