package com.dgmf.a.java.basics.primitves;

public class OctalHexaBinaryNumericPrimitives {
    public static void main(String[] args) {
        // Octal (0 - 7)
        int firstOct = 07; // 7 decimal
        int secondOct = 010; // 8 decimal
        int thirdOCt = 022; // 18 decimal
        int sumOct = firstOct + secondOct + thirdOCt;
        System.out.println("== Octal (0 - 7) ==");
        System.out.println(firstOct);
        System.out.println(secondOct);
        System.out.println(thirdOCt);
        System.out.println(sumOct);
        System.out.println(Integer.toOctalString(firstOct));
        System.out.println(Integer.toOctalString(secondOct));
        System.out.println(Integer.toOctalString(thirdOCt));
        System.out.println(Integer.toOctalString(sumOct));

        // Hexadecimal (0 - 9 A - F)
        int firstHex = 0xF; // 15 decimal
        int secondHex = 0x1E; // 30 decimal
        int sumHex = firstHex + secondHex; // 45 decimal
        System.out.println("== Hexadecimal (0 - 9 A - F) ==");
        System.out.println(firstHex);
        System.out.println(secondHex);
        System.out.println(sumHex);
        System.out.println(Integer.toHexString(firstHex));
        System.out.println(Integer.toHexString(secondHex));
        System.out.println(Integer.toHexString(sumHex));

        // Binary (0 - 1)
        int firstBin = 0b1001;
        int secondBin = 0b0111;
        int sumBin = firstBin + secondBin;
        System.out.println("== Binary (0 - 1) ==");
        System.out.println(firstBin);
        System.out.println(secondBin);
        System.out.println(sumBin);
        System.out.println(Integer.toBinaryString(firstBin));
        System.out.println(Integer.toBinaryString(secondBin));
        System.out.println(Integer.toBinaryString(sumBin));
    }
}
