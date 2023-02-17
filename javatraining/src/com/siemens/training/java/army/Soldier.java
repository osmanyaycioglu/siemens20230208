package com.siemens.training.java.army;

import java.security.SecureRandom;
import java.util.Random;

public class Soldier {

    private final ESoldierType soldierType;
    private final Random       randomLoc = new SecureRandom();

    public Soldier(final ESoldierType soldierTypeParam) {
        super();
        this.soldierType = soldierTypeParam;
    }

    public boolean shoot(final int range) {
        int nextIntLoc = this.randomLoc.nextInt(100);
        int rangeEffect = 5;
        int shootProbThreshold = 50;
        if (this.soldierType == ESoldierType.SNIPER) {
            rangeEffect = 40;
            shootProbThreshold = 70;
        } else if (this.soldierType == ESoldierType.NORMAL) {
            rangeEffect = 20;
            shootProbThreshold = 50;
        } else if (this.soldierType == ESoldierType.BAD) {
            rangeEffect = 5;
            shootProbThreshold = 40;
        } else if (this.soldierType == ESoldierType.GLADIATOR) {
            rangeEffect = 40;
            shootProbThreshold = 70;
        }
        int probShoot = range / rangeEffect;
        System.out.println("Shoot -> Range effect : "
                           + rangeEffect
                           + " shootp : "
                           + shootProbThreshold
                           + "  probShoot : "
                           + probShoot
                           + " randomInt : "
                           + nextIntLoc);
        if (nextIntLoc < (shootProbThreshold - probShoot)) {
            return true;
        }

        return false;
    }

    public boolean duck(final int range) {
        int nextIntLoc = this.randomLoc.nextInt(100);
        int rangeEffect = 5;
        int damageProbThreshold = 50;
        if (this.soldierType == ESoldierType.SNIPER) {
            rangeEffect = 40;
            damageProbThreshold = 70;
        } else if (this.soldierType == ESoldierType.NORMAL) {
            rangeEffect = 10;
            damageProbThreshold = 50;
        } else if (this.soldierType == ESoldierType.BAD) {
            rangeEffect = 2;
            damageProbThreshold = 30;
        } else if (this.soldierType == ESoldierType.GLADIATOR) {
            return false;
        }
        int probShoot = range / rangeEffect;
        System.out.println("Duck -> Range effect : "
                           + rangeEffect
                           + " damagep : "
                           + damageProbThreshold
                           + "  probShoot : "
                           + probShoot
                           + " randomInt : "
                           + nextIntLoc);
        if ((nextIntLoc - probShoot) < damageProbThreshold) {
            return true;
        }

        return false;
    }

}
