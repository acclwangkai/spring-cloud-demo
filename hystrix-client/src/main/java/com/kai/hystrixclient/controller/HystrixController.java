package com.kai.hystrixclient.controller;

import com.kai.hystrixclient.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HystrixController {

    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/hystrix-consumer", method = RequestMethod.GET)
    public String helloConsumer(@RequestParam String name) {
        return helloService.hiService(name);
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
