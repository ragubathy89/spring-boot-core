package com.app;

import com.app.config.PropertiesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.io.PrintStream;
import java.util.Arrays;

@SpringBootApplication
public class SpringBootCoreApplication {



    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringBootCoreApplication.class);
        app.setBannerMode(Banner.Mode.CONSOLE);
        ConfigurableApplicationContext ac = app.run(args);
        Arrays.stream(ac.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("MyApplicationRunner bean ->"+ ac.getBean("myApplicationRunner"));
        System.out.println("MyCommandLineRunner bean ->"+ ac.getBean("myCommandLineRunner"));
        System.out.println("Running Spring Core Application");

    }

}
