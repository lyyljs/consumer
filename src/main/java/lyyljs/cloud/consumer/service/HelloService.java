package lyyljs.cloud.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lyyljs.cloud.consumer.hystrix.HelloServiceHystrix;

@FeignClient(name = "spring-cloud-producer",
				path = "/hello",
				fallback = HelloServiceHystrix.class)
public interface HelloService {
	@RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
	
	@RequestMapping(value = "/sleep")
	public String sleep();
	
	@RequestMapping(value = "/exception")
	public String exception();
}
