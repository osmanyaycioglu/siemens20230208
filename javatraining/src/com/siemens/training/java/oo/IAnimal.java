package com.siemens.training.java.oo;

import java.io.Closeable;

public interface IAnimal extends IAnimalBaseActions, Closeable {

    String move(int range);

    String sleep(int hour);

}
