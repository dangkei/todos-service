/**
 * 
 */
package com.dangkei.todos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dangkei.todos.entity.TodoItem;

/**
 * @author Administrator *
 */
@RestController
@RequestMapping("/todo")
public class TodoController {

	@RequestMapping("list")
	public List<TodoItem> todoList(){
		return null;
		
	}
}
