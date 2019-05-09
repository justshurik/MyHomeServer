package ru.justshurik.examples;

import java.io.Serializable;

public class Profile implements Serializable{
	
	private String name;
	private String lastName;
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
