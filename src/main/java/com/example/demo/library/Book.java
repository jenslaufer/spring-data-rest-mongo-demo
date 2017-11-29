package com.example.demo.library;

import org.springframework.data.annotation.Id;

public class Book {
	@Id
	private String id;
	private String title;
	private Author author;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public void setId(String id) {
		this.id = id;
	}

}
