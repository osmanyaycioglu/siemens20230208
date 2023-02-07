package com.siemens.training.java;

//import com.siemens.training.java.pkg.*;
import com.siemens.training.java.pkg.OtherPackageClass;

public class FirstObject {

	private int field1;
	private int field2 = 130;
	private int field3;

	public FirstObject() {
		field1 = 100;
		System.out.println("First Obj yaratıldı : " + field1);
	}

	public FirstObject(int fieldIntial) {
		// constructor begin
		field1 = fieldIntial; // Intialization comment
		field2 = 140;
		System.out.println("First Obj yaratıldı : " + field1);
	}

	private int consolidateField() {
		return field1 * 10;
	}

	public void processField() {
		OtherPackageClass opc = new OtherPackageClass(200,100);
		long result = opc.calculateMass();
		System.out.println("method 2 : " + result);
		// System.out.println("method 2 : " + opc.calculateMass());
		field1 = 300;
	}


	public int getField2() {
		return field2;
	}

	public void setField2(int field2) {
//		if (field2 > 300) {
//			throw new IllegalStateException("field 300 den büyük olamaz");
//		}
		this.field2 = field2;
	}

	public int getField1() {
		return field1;
	}

}
