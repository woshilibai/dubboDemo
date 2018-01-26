package com.ifunyoung.provider;

import com.ifunyoung.api.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHi(String name) {
        return "hello," + name;
    }
}
