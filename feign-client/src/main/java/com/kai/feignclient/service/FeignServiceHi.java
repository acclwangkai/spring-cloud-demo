package com.kai.feignclient.service;

import com.kai.feignclient.component.ServiceHiHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * created by wangkai
 */
@FeignClient(value = "service-hi",fallback = ServiceHiHystrix.class)
@Service
public interface FeignServiceHi {

    /**
     * 调用service-hi服务方法
     * @param name
     * @return
     */
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
