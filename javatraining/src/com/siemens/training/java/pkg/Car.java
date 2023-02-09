package com.siemens.training.java.pkg;

public class Car {

    private int speed;
    private int range;
    private int depo;

    //	public Car() {
    //	}

    public Car(int speed,
               int range,
               int depo) {
        super();
        this.speed = speed;
        this.range = range;
        this.depo = depo;
    }

    public double effectiveness() {
        return range / speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getDepo() {
        return depo;
    }

    public void setDepo(int depo) {
        this.depo = depo;
    }

    @Override
    public String toString() {
        return "XYZ [speed=" + speed + ", range=" + range + ", depo=" + depo + "] skdfjhskfjhs";
    }

}
