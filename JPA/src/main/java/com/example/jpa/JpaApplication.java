package com.example.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class JpaApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(JpaApplication.class, args);
        UserRepository userRepository = context.getBean(UserRepository.class);

        Optional<User> user = userRepository.findById(Long.valueOf(20));

        // cach lay id ntn?
        System.out.println(user);

        User user1 = userRepository.findUserByDefQuery(1000 );
        System.out.println("User def: " + user1);
    }

}
