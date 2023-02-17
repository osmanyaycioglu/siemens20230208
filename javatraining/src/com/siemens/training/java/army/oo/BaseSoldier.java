package com.siemens.training.java.army.oo;

import java.security.SecureRandom;
import java.util.Random;

public class BaseSoldier implements ISoldier {

    private final Random randomLoc = new SecureRandom();
    private int          rangeEffect;
    private int          damageProbThreshold;
    private final int    shootProbThreshold;

    public BaseSoldier(final int rangeEffectParam,
                       final int damageProbThresholdParam,
                       final int shootProbThresholdParam) {
        super();
        this.rangeEffect = rangeEffectParam;
        this.damageProbThreshold = damageProbThresholdParam;
        this.shootProbThreshold = shootProbThresholdParam;
    }

    @Override
    public boolean shoot(final int range) {
        int nextIntLoc = this.randomLoc.nextInt(100);
        int probShoot = range / this.rangeEffect;
        System.out.println("Shoot -> Range effect : "
                           + this.rangeEffect
                           + " shootp : "
                           + this.shootProbThreshold
                           + "  probShoot : "
                           + probShoot
                           + " randomInt : "
                           + nextIntLoc);
        if (nextIntLoc < (this.shootProbThreshold - probShoot)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean duck(final int range) {
        int nextIntLoc = this.randomLoc.nextInt(100);
        this.rangeEffect = 40;
        this.damageProbThreshold = 70;
        int probShoot = range / this.rangeEffect;
        System.out.println("Duck -> Range effect : "
                           + this.rangeEffect
                           + " damagep : "
                           + this.damageProbThreshold
                           + "  probShoot : "
                           + probShoot
                           + " randomInt : "
                           + nextIntLoc);
        if ((nextIntLoc - probShoot) < this.damageProbThreshold) {
            return true;
        }
        return false;
    }

}
