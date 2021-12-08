package fr.lernejo.todo;

import org.jetbrains.annotations.NotNull;
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
	public void addTodo(@RequestBody @NotNull Todo todo) {
		TodoEntity entity = new TodoEntity();
		entity.author = todo.author();
		entity.message = todo.message();
		todos.save(entity);
	}

	@GetMapping("/api/todo")
	public Iterable<TodoEntity> getTodos() {
		return todos.findAll();
	}
}
