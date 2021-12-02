package fr.lernejo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TodoListController {
	private final TodoRepository todos;

	public TodoListController(TodoRepository repo) {
		todos = repo;
	}

	@PostMapping("/api/todo")
	public void addTodo(@RequestBody Todo todo) {
		todos.save(todo);
	}

	@GetMapping("/api/todo")
	public TodoRepository getTodos() {
		return todos;
	}
}
