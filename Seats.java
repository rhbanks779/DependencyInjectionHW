package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Seats {

	private String style;
	private String color;
	private String make;
	private int number;
	
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void comfort() {
		System.out.println("These seats are comfortable!");
	}
	
	public void capacity() {
		System.out.println("Sorry, we are at full capacity, all seats are taken!");
	}
}
