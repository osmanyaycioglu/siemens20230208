package com.siemens.training.calori.calculator;

public class Human implements IHuman {

    private final int     height;
    private final int     weight;
    private final int     age;
    private final EGender gender;
    private double        remainedCal;

    public Human(final int heightParam,
                 final int weightParam,
                 final int ageParam,
                 final EGender genderParam) {
        super();
        this.height = heightParam;
        this.weight = weightParam;
        this.age = ageParam;
        this.gender = genderParam;
    }

    @Override
    public EatResult eat(final IFood foodParam,
                         final int intakeGrParam) {
        double calculateCaloriLoc = foodParam.calculateCalori(intakeGrParam);
        EatResult eatResultLoc = new EatResult();
        eatResultLoc.setCalori(calculateCaloriLoc);
        this.remainedCal += calculateCaloriLoc;
        return eatResultLoc;
    }

    @Override
    public ExerciseResult exercise(final ISport sportParam,
                                   final int durationParam) {
        double caloriBurnLoc = sportParam.caloriBurn(durationParam,
                                                     this);
        ExerciseResult exerciseResultLoc = new ExerciseResult();
        exerciseResultLoc.setCalori(caloriBurnLoc);
        this.remainedCal -= caloriBurnLoc;
        return exerciseResultLoc;
    }

    @Override
    public double getBMI() {
        double meter = (this.height / 100D);
        return this.weight / (meter * meter);
    }

}
