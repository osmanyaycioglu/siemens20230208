package com.siemens.training.java.java8;

public class ExecuteImpl implements IExecute {

    @Override
    public String execute(final int countParam,
                          final String opNameParam) {

        return opNameParam + " executed";
    }

}
