package fr.lernejo.todo;

public class Todo extends TodoIdentity {
	private final String message;
	private final String author;

	public Todo(String message, String author) {
		this.message = message;
		this.author = author;
	}

	public String getMessage() {
		return message;
	}

	public String getAuthor() {
		return author;
	}
}
