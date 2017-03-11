package project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * Created by g00216500 on 2017/3/11.
 */
@SpringBootApplication
@EnableEurekaClient
public class application {
    public static void main(String[] args)
    {
        SpringApplication.run(application.class, args);
    }
}
