package com.maram.dep_micro;

import com.maram.dep_micro.entities.Department;
import com.maram.dep_micro.repos.DepartmentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DepMicroApplication {
    @Bean
    CommandLineRunner commandLineRunner(DepartmentRepository departmentRepository) {
        return args -> {
            departmentRepository.save(Department.builder()
                    .depName("Info Tech")
                    .depCode("IT")
                    .build());
            departmentRepository.save(Department.builder()
                    .depName("Marketing")
                    .depCode("MK")
                    .build());
        };
    }
    public static void main(String[] args) {
        SpringApplication.run(DepMicroApplication.class, args);
    }

}
