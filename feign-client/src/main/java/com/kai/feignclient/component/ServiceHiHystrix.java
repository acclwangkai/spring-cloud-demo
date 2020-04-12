package com.kai.feignclient.component;

import com.kai.feignclient.service.FeignServiceHi;
import org.springframework.stereotype.Component;

@Component
public class ServiceHiHystrix implements FeignServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry,"+name+", this message send failed!";
    }
}
