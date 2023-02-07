package com.siemens.training.java.pkg;

//immutable object
public class OtherPackageClass {

	private int height;
	private int weight;

	public OtherPackageClass(int height, int weight) {
		super();
		this.height = height;
		this.weight = weight;
	}

	public long calculateMass() {
		return height * weight;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

}
