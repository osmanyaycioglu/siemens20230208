package com.siemens.training.java.classdesign;

//POJO
//DTO
public class Person {

	private String firstName;
	private String lastName;
	private int height;
	private int weight;
	
	public Person() {
	}
	
	public Person(String firstName, String lastName, int height, int weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.height = height;
		this.weight = weight;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", height=" + height + ", weight=" + weight
				+ "]";
	}
	
	
	
}
