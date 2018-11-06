package com.zhmf.edct.account.service;

import com.zhmf.edct.account.component.AccountServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// service-hi是服务名 spring.application.name
@FeignClient(value = "service-hi", fallback = AccountServiceHystric.class)
public interface AccountService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}