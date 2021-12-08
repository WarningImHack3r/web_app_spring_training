package fr.lernejo.todo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("todo")
public class TodoEntity {
	@Id
	public Long id;
	@SuppressWarnings("java:S1104")
	public String message;
	@SuppressWarnings("java:S1104")
	public String author;
}
