package com.szymonwrobel.module.books.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "books")
public class BooksEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull(message = "Author for book is required")
	private String author;
	@NotNull(message = "Title for book is required")
	private String title;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "details_id", referencedColumnName = "id")
	private BooksDetailEntity details;

	@OneToMany(mappedBy="book", cascade = CascadeType.ALL)
	private Set<BooksTagsEntity> tags;

	public Set<BooksTagsEntity> getTags() {
		return tags;
	}

	public BooksEntity setTags(Set<BooksTagsEntity> tags) {
		this.tags = tags;
		return this;
	}

	public BooksDetailEntity getDetails() {
		return details;
	}

	public BooksEntity setDetails(BooksDetailEntity details) {
		this.details = details;
		return this;
	}

	public Long getId() {
		return id;
	}

	public BooksEntity setId(Long id) {
		this.id = id;
		return this;
	}

	public String getAuthor() {
		return author;
	}

	public BooksEntity setAuthor(String author) {
		this.author = author;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public BooksEntity setTitle(String title) {
		this.title = title;
		return this;
	}
}
