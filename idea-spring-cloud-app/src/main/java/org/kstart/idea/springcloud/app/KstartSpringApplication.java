package org.kstart.idea.springcloud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class KstartSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(KstartSpringApplication.class, args);
    }
}
