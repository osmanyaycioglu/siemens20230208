package com.siemens.training.java.adv;

public class AdvRunner {
	public static void main(String[] args) {
		AdvPerson osman = new AdvPerson(EGender.MALE, 53, EHairColor.BLACK,200);
		AdvPerson osman2 = new AdvPerson(EGender.MALE, 53, EHairColor.RED,200);
		AdvPerson nil = new AdvPerson(EGender.FEMALE, 45, EHairColor.BROWN,177);
		AdvPerson mehmet = new AdvPerson(EGender.MALE, 22, EHairColor.BLACK,180);
		AdvPerson ayse = new AdvPerson(EGender.FEMALE, 25, EHairColor.BLOND,155);
		AdvPerson tempPerson = osman;
		
		osman.setAge(ayse.getAge());
		osman.setGender(ayse.getGender());
		osman.setHairColor(ayse.getHairColor());
		
		osman = ayse;
		osman.getAge();
		
		nil = mehmet;
		
		osman = nil;
		osman.getAge();
		osman.setAge(85);
		nil.getAge();
		osman.getAge();
		osman.getGender();
		nil.getHairColor();
		AdvPerson kisi = osman;
		kisi.getAge();
		kisi = new AdvPerson(EGender.UNKOWN, 98, EHairColor.WHITE,153);
		kisi.getAge();
		osman.getAge();
		mehmet.getAge();
		osman = tempPerson;
		osman.getAge();
		
		
	}
}
