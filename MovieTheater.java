package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class MovieTheater {

	private String name;
	private String addr;
	private int capacity;
	
	@Autowired
	private Seats seat;
	
	@Autowired
	public void setSeat(Seats seat) {
		this.seat = seat;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void welcome() {
		System.out.println("Welcome to " + name + "!");
	}
	
	public void showCapacity() {
		seat.capacity();
	}
	
	public void showComfort() {
		seat.comfort();
	}
}
