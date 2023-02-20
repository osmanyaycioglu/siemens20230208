package com.unit.test.mest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyFirstTest {

    @Test
    public void test_string_contians() {
        String stringLoc = "osman likes development";
        Assertions.assertTrue(stringLoc.contains("deve"));
        Assertions.assertFalse(stringLoc.contains("ays"));
        Assertions.assertTrue(stringLoc.contains("xyz"));

    }

}
