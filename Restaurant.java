package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class Restaurant {

	private String name;
	private String type;
	private Boolean open;
	
	@Autowired
	private Seats seat;
	
	public void setSeat(Seats seat) {
		this.seat=seat;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getOpen() {
		return open;
	}

	public void setOpen(Boolean open) {
		this.open = open;
	}

	public void welcome() {
		System.out.println("Welcome to " + name + ", we are a famous " + type + " restaurant!");
	}
	
	public void showComfort() {
		seat.comfort();
	}
	
	public void showCapacity() {
		seat.capacity();
	}
}
