package com.zhmf.edct.account.component;

import com.zhmf.edct.account.service.AccountService;
import org.springframework.stereotype.Component;

@Component
public class AccountServiceHystric implements AccountService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}