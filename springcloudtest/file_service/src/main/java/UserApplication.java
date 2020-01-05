package application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: <br/>
 * @Copyright(c): 2019, Rookie <br/>
 * @ProgramName: UserApplication.java <br/>
 * @Date: 2019/12/20 18:30
 * @Author: Rookie-nie <br/>
 * @Version: 1.0
 */
@Slf4j
@EnableEurekaClient
@EnableAutoConfiguration
@Configuration
@ComponentScan("con.rookie.springcloud")
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }


}
