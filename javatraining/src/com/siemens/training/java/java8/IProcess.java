package com.siemens.training.java.java8;

public interface IProcess<R, T, M> {

    R process(T id,
              M procesName);
}
