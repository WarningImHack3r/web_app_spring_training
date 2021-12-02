package fr.lernejo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TodoListController {
	private final ArrayList<Todo> todos;

	public TodoListController() {
		todos = new ArrayList<>();
	}

	@PostMapping("/api/todo")
	public void addTodo(@RequestBody Todo todo) {
		todos.add(todo);
	}

	@GetMapping("/api/todo")
	public ArrayList<Todo> getTodos() {
		return todos;
	}
}
