package com.my;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableFeignClients
@EnableAsync
@ServletComponentScan(basePackages = {"com.my.filter"})
@SpringBootApplication
public class MyAppApplication {

    public static void main(String args[]) {
        SpringApplication.run(MyAppApplication.class, args);
    }

}
