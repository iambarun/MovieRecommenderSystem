package io.datajek.spring.basics.movierecommendersystem.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieRecommenderSystemApplication.class);
        System.out.println("Hello world! The SpringBoot Movie Recommendation System Started");
    }
}