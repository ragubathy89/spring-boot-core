package com.app.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MyApplicationRunner implements ApplicationRunner, Ordered {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Running Application Runner");
        System.out.println(args.getNonOptionArgs());
        System.out.println(args.getOptionNames());
        System.out.println(Arrays.asList(args.getSourceArgs()));

    }

    @Override
    public int getOrder() {
        return 10;
    }
}
