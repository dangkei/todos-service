package com.dangkei.todos.mapper;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dangkei.todos.entity.TodoItem;

@Repository
public interface TodoMapper extends BaseMapper<TodoItem>{

}
