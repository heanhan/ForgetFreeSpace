package com.zjh.space;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableSwagger2Doc
public class ForgetFreeSpaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForgetFreeSpaceApplication.class, args);
    }

}
