package com.siemens.training.java.adv;

public class AdvPerson {
	private EGender gender;
	private int age;
	private EHairColor hairColor;
	private int height;
	
	public AdvPerson(EGender gender, int age, EHairColor hairColor,int height) {
		this.gender = gender;
		this.age = age;
		this.hairColor = hairColor;
		this.height = height;
	}
	
	public EGender getGender() {
		return this.gender;
	}
	public void setGender(EGender genderParam) {
		gender = genderParam;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public EHairColor getHairColor() {
		return hairColor;
	}
	public void setHairColor(EHairColor hairColor) {
		this.hairColor = hairColor;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
}
