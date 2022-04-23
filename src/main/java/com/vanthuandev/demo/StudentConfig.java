package com.vanthuandev.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student thuan = new Student(
                    1L,
                    "Van thuan",
                    "ngovanthuan07@gmail.com",
                    LocalDate.of(2001, Month.JANUARY, 8)
            );
            Student hieu =  new Student(
                    1L,
                    "Minh Hieu",
                    "nguyenminhhieu07@gmail.com",
                    LocalDate.of(2001, Month.MARCH, 2)
            );
            repository.saveAll(List.of(thuan, hieu));
        };

    }
}
