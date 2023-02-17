package com.siemens.training.bank.operations;

import java.util.Scanner;

import com.siemens.training.bank.Customer;

public interface IExecuteOperation {

    void execute(Scanner scannerParam,
                 Customer customerParam);

    String getOperationName();

    String getOperationDesc();

}
