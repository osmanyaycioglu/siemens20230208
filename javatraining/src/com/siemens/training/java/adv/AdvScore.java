package com.siemens.training.java.adv;

public class AdvScore {

	private int hit;
	private int score;
	private double weight;
	private int count;
	
	public void increaseCount() {
		count++;
	}
	
	public void increaseHit() {
		hit++;
	}
	public void increaseScore(int scoreDelta) {
		score += scoreDelta;
	}
	
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public double getWeight() {
		return score/count;
	}

	@Override
	public String toString() {
		return "AdvScore [hit=" + hit + ", score=" + score + ", weight=" + getWeight() + ", count=" + count + "]";
	}

	
	
}
