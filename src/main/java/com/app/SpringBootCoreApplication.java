package com.app;

import com.app.config.PropertiesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
public class SpringBootCoreApplication {



    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringBootCoreApplication.class);
        app.setBannerMode(Banner.Mode.CONSOLE);
        app.run(args);
        System.out.println("Running Spring Core Application");

    }

}
