package com.siemens.training.java.exceptions;

import java.io.IOException;
import java.util.zip.DataFormatException;

public class MyFinalCalculate {

    public static Integer calculateOnceMore(Integer speed,
                                            Integer gasAmount,
                                            Integer depoCap) throws IOException, DataFormatException {

        if (speed == null) {
            throw new IOException("speed girilmedi");
        }
        if (gasAmount == null) {
            throw new DataFormatException("gasAmount girilmedi");
        }
        if (depoCap == null) {
            throw new IllegalArgumentException("depoCap girilmedi");
        }

        return (200 / speed) * (gasAmount / depoCap);
    }
}
