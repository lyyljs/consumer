package lyyljs.cloud.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lyyljs.cloud.consumer.service.HelloService;

@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;
	
    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloService.hello(name);
    }
    
    @RequestMapping("/sleep")
    public String sleep(){
    	return helloService.sleep();
    }
    
    @RequestMapping("/exception")
    public String exception(){
    	return helloService.exception();
    }
}
