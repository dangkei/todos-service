package com.dangkei.todos;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dangkei.todos.mapper")
public class TodosServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodosServiceApplication.class, args);
    }

}
