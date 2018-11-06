package com.zhmf.edct.account.controller;

import com.zhmf.edct.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping(value = "/hi") // 暴露的一个接口
    public String sayHi(@RequestParam String name) {
        System.out.println("Hi...");
        return accountService.sayHiFromClientOne(name);
    }
}