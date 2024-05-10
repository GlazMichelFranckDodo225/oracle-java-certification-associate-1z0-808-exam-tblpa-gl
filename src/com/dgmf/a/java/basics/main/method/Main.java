package com.dgmf.a.java.basics.main.method;

public class Main {
    public static void main(String[] args) {
        // Size ==> 0
        System.out.println("Size of 'args' Table is : " + args.length);
        System.out.println(args[0]);
        System.out.println(args[1]);
        // ArrayIndexOutOfBoundsException
        // System.out.println(args[2]);
    }
}