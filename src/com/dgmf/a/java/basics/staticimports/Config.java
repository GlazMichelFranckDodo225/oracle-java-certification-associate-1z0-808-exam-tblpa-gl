package com.dgmf.a.java.basics.staticimports;

public class Config {
    public static final String NAME = "myName";
    public static final int MAX_COLUMN_COUNT = 5;

    public static void printConfig() {
        System.out.println("Name = " + NAME + "\n" +
                "Column Count = " + MAX_COLUMN_COUNT);
    }
}
