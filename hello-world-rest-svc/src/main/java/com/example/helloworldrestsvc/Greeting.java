/*
 * Resource representation class to determine how the value/data is going to look like.
 * Typically can be thought of as a Getter/Setter class.
 */
package com.example.helloworldrestsvc;

public class Greeting {

	private final long id;
	private final String content;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}