package com.lixiong.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description:
 * Created by lixiong on 2017/10/13.
 */
@SpringBootApplication
public class AdminApplication {

    public static void main(String[] args){
        SpringApplication application = new SpringApplication(AdminApplication.class);
        application.run(args);
    }
}
