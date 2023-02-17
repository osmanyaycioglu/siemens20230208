package com.siemens.training.calori.calculator;

public interface IHuman {

    EatResult eat(IFood foodParam,
                  int intakeGr);

    ExerciseResult exercise(ISport sportParam,
                            int duration);

    double getBMI();
}
