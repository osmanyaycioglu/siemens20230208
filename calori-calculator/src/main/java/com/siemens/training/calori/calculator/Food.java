package com.siemens.training.calori.calculator;

public abstract class Food implements IFood {

    private final int proteinGr;
    private final int carbonHydrateGr;
    private final int fatGr;

    public Food(final int proteinGrParam,
                final int carbonHydrateGrParam,
                final int fatGrParam) {
        super();
        this.proteinGr = proteinGrParam;
        this.carbonHydrateGr = carbonHydrateGrParam;
        this.fatGr = fatGrParam;
    }

    @Override
    public double calculateCalori(final int intakeGrParam) {
        return (this.proteinGr * 3) + (this.carbonHydrateGr * 6) + (this.fatGr * 9);
    }

}
