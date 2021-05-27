package br.uniso.alunoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AlunoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlunoServiceApplication.class, args);
    }

}
