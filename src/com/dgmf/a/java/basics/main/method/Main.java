package com.dgmf.a.java.basics.main.method;

/**
 * Javadoc
 * @author Glaz Dodo
 */
public class Main {
    /**
     * Javadoc
     * This Main Method
     * @param args Command Line Arguments
     */
    public static void main(String[] args) {
        // Size ==> 0 | Single Line Comment
        System.out.println("Size of 'args' Table is : " + args.length);
        /*
        * Multiple Lines Comment
        * Another Line
        */
        System.out.println(args[0]);
        System.out.println(args[1]);
        // ArrayIndexOutOfBoundsException | Single Line Comment
        // System.out.println(args[2]); | Single Line Comment ==> Disable the Line of Code

        System.out.println(sum(15, 2));;
    }

    /**
     * Javadoc
     * Calculate Sum of Integers
     * @param num1 Operand
     * @param num2 Operand
     * @return int
     */
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
}