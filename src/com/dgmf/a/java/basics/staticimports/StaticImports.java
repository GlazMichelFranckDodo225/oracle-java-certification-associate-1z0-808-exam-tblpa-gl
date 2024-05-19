package com.dgmf.a.java.basics.staticimports;

// import static java.lang.Math.*;

import static java.lang.Math.PI;
import static java.lang.Math.min;

public class StaticImports {
    public static void main(String[] args) {
        // Static Method from Math Class : min()
        // int min = Math.min(5, 7);
        int min = min(5, 7);
        System.out.println("Min = " + min);
        // Static Constant from Math Class : PI
        // System.out.println(Math.PI);
        System.out.println(PI);
    }
}
