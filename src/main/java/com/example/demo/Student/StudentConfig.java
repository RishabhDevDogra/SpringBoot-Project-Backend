package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student(

                    "Mariam",
                    "Mariam@gmail.com",
                    LocalDate.of(2000, AUGUST, 5)
            );

            Student Alex = new Student(

                    "Alex",
                    "Alex@gmail.com",
                    LocalDate.of(1999, AUGUST, 10)
            );
            repository.saveAll(
                    List.of(mariam,Alex)
            );
        };
    }
}
