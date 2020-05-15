package com.gwssi.liuzenglu;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //Eureka Client
public class DemoServerMain {
    public static void main(String[] args) {
        new SpringApplicationBuilder(DemoServerMain.class).web(true).run(args);
    }
}