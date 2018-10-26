package io.vipin.dtc.model;

import javax.validation.constraints.NotNull;

import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

@Document
public class M1Model {
	
	@Id
	@Field
	@NotNull
	private String bookId;
	@Field
	@NotNull
	private String bookName;
	@Field
	@NotNull
	private String authorName;
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public M1Model(@NotNull String bookId, @NotNull String bookName, @NotNull String authorName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
	}
	public M1Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
