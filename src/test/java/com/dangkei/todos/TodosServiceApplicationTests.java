package com.dangkei.todos;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dangkei.todos.entity.TodoItem;
import com.dangkei.todos.mapper.TodoMapper;

@SpringBootTest
class TodosServiceApplicationTests {
	
	@Autowired
	TodoMapper todoMapper;

    @Test
    void contextLoads() {
    	System.out.println(("----- selectAll method test 测试查询所有用户方法 ------"));
        //selectList 的参数wrapper 是条件构造器，可以先写null
        List<TodoItem> userList = todoMapper.selectList(null);
        //forEach 的参数是 Consumer类型的 语法糖
        userList.forEach(System.out::println);
    }

}
