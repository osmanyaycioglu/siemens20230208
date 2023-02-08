package com.siemens.training.java.adv;

public class AdvOperations {

	public boolean checkAdv(AdvPerson person, Adv adv) {
		if (adv.getAgeMin() != null && adv.getAgeMax() != null) {
			if (person.getAge() > adv.getAgeMin() && person.getAge() < adv.getAgeMax()) {
				return true;
			}
		} else if (adv.getAgeMax() != null) {
			if (person.getAge() < adv.getAgeMax()) {
				return true;
			}

		} else if (adv.getAgeMin() != null) {
			if (person.getAge() > adv.getAgeMin()) {
				return true;
			}
		}
		
		if (adv.getGenderCheck() != null) {
			if (person.getGender() == adv.getGenderCheck()) {
				return true;
			}
		}

//		if (adv.getAgeMin() != null && adv.getAgeMax() != null && (person.getAge() > adv.getAgeMin() && person.getAge() < adv.getAgeMax())) {
//				return true;
//		} else if (adv.getAgeMax() != null && person.getAge() < adv.getAgeMax()) {
//				return true;
//		} else if (adv.getAgeMin() != null && person.getAge() > adv.getAgeMin()) {
//				return true;
//		}

		return false;
	}

}
