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
		if (adv.getHairColorCheck() != null) {
			if (person.getHairColor() == adv.getHairColorCheck()) {
				return true;
			}
		}
		if (adv.getHeightMin() != null && adv.getHeightMax() != null) {
			if (person.getHeight() > adv.getHeightMin() && person.getHeight() < adv.getHeightMax()) {
				return true;
			}
		} else if (adv.getHeightMax() != null) {
			if (person.getHeight() < adv.getHeightMax()) {
				return true;
			}
		} else if (adv.getHeightMin() != null) {
			if (person.getHeight() > adv.getHeightMin()) {
				return true;
			}
		}
		return false;
	}
	
	public AdvScore checkScore(AdvPerson person, Adv adv) {
		AdvScore advScore = new AdvScore();
		
		
		if (adv.getAgeMin() != null && adv.getAgeMax() != null) {
			advScore.increaseCount();
			if (person.getAge() > adv.getAgeMin() && person.getAge() < adv.getAgeMax()) {
				advScore.increaseHit();
				advScore.increaseScore(7);
			}
		} else if (adv.getAgeMax() != null) {
			advScore.increaseCount();
			if (person.getAge() < adv.getAgeMax()) {
				advScore.increaseHit();
				advScore.increaseScore(7);
			}

		} else if (adv.getAgeMin() != null) {
			advScore.increaseCount();
			if (person.getAge() > adv.getAgeMin()) {
				advScore.increaseHit();
				advScore.increaseScore(7);
			}
		}

		if (adv.getGenderCheck() != null) {
			advScore.increaseCount();
			if (person.getGender() == adv.getGenderCheck()) {
				advScore.increaseHit();
				advScore.increaseScore(5);
			}
		}
		

//		if (adv.getAgeMin() != null && adv.getAgeMax() != null && (person.getAge() > adv.getAgeMin() && person.getAge() < adv.getAgeMax())) {
//				return true;
//		} else if (adv.getAgeMax() != null && person.getAge() < adv.getAgeMax()) {
//				return true;
//		} else if (adv.getAgeMin() != null && person.getAge() > adv.getAgeMin()) {
//				return true;
//		}
		
		if (adv.getHairColorCheck() != null) {
			advScore.increaseCount();
			if (person.getHairColor() == adv.getHairColorCheck()) {
				advScore.increaseHit();
				advScore.increaseScore(1);
			}
		}
		if (adv.getHeightMin() != null && adv.getHeightMax() != null) {
			advScore.increaseCount();
			if (person.getHeight() > adv.getHeightMin() && person.getHeight() < adv.getHeightMax()) {
				advScore.increaseHit();
				advScore.increaseScore(3);
			}
		} else if (adv.getHeightMax() != null) {
			advScore.increaseCount();
			if (person.getHeight() < adv.getHeightMax()) {
				advScore.increaseHit();
				advScore.increaseScore(3);
			}
		} else if (adv.getHeightMin() != null) {
			advScore.increaseCount();
			if (person.getHeight() > adv.getHeightMin()) {
				advScore.increaseHit();
				advScore.increaseScore(3);
			}
		}
		return advScore;
	}

}
