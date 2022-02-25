package fr.lernejo.todo;

import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/todo")
public record TodoListController(TodoRepository repository) {

	@PostMapping
	public void addTodo(@RequestBody @NotNull Todo todo) {
		TodoEntity entity = new TodoEntity();
		entity.author = todo.author();
		entity.message = todo.message();
		repository.save(entity);
	}

	@GetMapping
	public @NotNull Iterable<TodoEntity> getTodos() {
		return repository.findAll();
	}
}
