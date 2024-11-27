package org.example.kmmt70;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableScheduling
public class Kmmt70Application {

    public static void main(String[] args) {
        SpringApplication.run(Kmmt70Application.class, args);
        System.out.println("Bot token: " + System.getenv("BOT_TOKEN"));

    }

}
