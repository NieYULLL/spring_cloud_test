package com.rookie.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description: <br/>
 * @Copyright(c): 2020, Rookie <br/>
 * @ProgramName: UserStarter.java <br/>
 * @Date: 2020/1/5 22:37
 * @Author: Rookie-nie <br/>
 * @Version: 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class UserStarter {
    public static void main(String[] args) {
            SpringApplication.run(UserStarter.class, args);
    }
}
