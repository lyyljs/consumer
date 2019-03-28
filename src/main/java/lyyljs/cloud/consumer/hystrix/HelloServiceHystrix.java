package lyyljs.cloud.consumer.hystrix;

import org.springframework.stereotype.Component;

import lyyljs.cloud.consumer.service.HelloService;

@Component
public class HelloServiceHystrix implements HelloService {

	@Override
	public String hello(String name) {
		return "default hello";
	}

	@Override
	public String sleep() {
		return "sleep failed";
	}

	@Override
	public String exception() {
		return "exception";
	}

}
