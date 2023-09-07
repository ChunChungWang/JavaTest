package test;

import java.io.Serializable;

public class Mammal implements Serializable{
	private String name;
	
	public Mammal(String name) {
		this.name = name;
	}
	
	public String getname() {
		return name;
	}
	public void speak() {
	}
}
