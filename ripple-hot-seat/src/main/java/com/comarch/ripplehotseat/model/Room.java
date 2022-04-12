package com.comarch.ripplehotseat.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author Krzysztof Sajkowski
 * 
 */
@Document(collection = "rooms")
public class Room {
	
	@Id
	private String id;
	private int number;
	
	public Room() {
	}
	
	public Room(int number) {
		this.number = number;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Room [id=" + id + ", number=" + number + "]";
	}
	
}
