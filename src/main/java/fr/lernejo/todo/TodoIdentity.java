package fr.lernejo.todo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("todo")
public class TodoIdentity {
	@Id
	public Long id;
	public String message;
	public String author;
}
