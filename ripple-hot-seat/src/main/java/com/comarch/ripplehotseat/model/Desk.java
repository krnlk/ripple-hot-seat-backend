package com.comarch.ripplehotseat.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author Krzysztof Sajkowski
 *
 */
@Document(collection = "desks")
public class Desk {
	
	@Id
	private String id;
	private String roomId;
	private int positionX;
	private int positionY;
	
	Desk(){
	}
	
	Desk(String roomId, int positionX, int positionY){
		this.roomId = roomId;
		this.positionX = positionX;
		this.positionY = positionY;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	@Override
	public String toString() {
		return "Desk [id=" + id + ", roomId=" + roomId + ", positionX=" + positionX + ", positionY=" + positionY
				+ "]";
	}
	
}
