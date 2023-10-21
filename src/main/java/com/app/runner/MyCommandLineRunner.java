package com.app.runner;

import com.app.config.PropertiesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Order(1)
public class MyCommandLineRunner implements CommandLineRunner {

    @Autowired
    private PropertiesConfig propConfig;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Running CommandLineRunner");
        Arrays.stream(args).forEach(System.out::println);

        System.out.println("PropConfig ->"+propConfig);
    }
}
