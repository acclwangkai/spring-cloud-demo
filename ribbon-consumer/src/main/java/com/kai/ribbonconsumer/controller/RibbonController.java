package com.kai.ribbonconsumer.controller;

import com.kai.ribbonconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RibbonController {

    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/hiRibbon", method = RequestMethod.GET)
    public String helloConsumer(@RequestParam String name) {
        return helloService.hiService(name);
    }

}
