package com.ifunyoung.consumer;

import com.ifunyoung.api.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
        System.out.println("===========================================service consumer start===========================================");
        context.start();
        HelloService helloService = context.getBean(HelloService.class);
        System.out.println("===========================================consumering...===========================================");
        System.out.println(helloService.sayHi("tianwl"));
    }
}
