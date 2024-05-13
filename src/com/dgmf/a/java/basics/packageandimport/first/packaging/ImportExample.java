// import com.dgmf.a.java.basics.packageandimport.another.packagingelse.MyClass; // Error ==> Package
// Name Must Be the First Instruction
package com.dgmf.a.java.basics.packageandimport.first.packaging;

// import java.lang.System; ==> Redundant (Done Automatically)
// import java.util.Random;
import java.util.*; // To Import all the "util" Package
// Import from Another Packages of the Application
// With "*" (Joker)
// import com.dgmf.a.java.basics.packageandimport.another.packagingelse.*;
// Individually (Full Qualified Name - FQN)
// import com.dgmf.a.java.basics.packageandimport.another.packagingelse.MyClass;
import com.dgmf.a.java.basics.packageandimport.another.packagingelse.ExampleClass;
import com.dgmf.a.java.basics.packageandimport.another.packagingelse.MyClass;

public class ImportExample {
    public static void main(String[] args) {
        Random random = new Random();
        // Random Number Between 0 and 5
        System.out.println(random.nextInt(5));

        ExampleClass exampleClass = new ExampleClass();
        MyClass myClass = new MyClass();
    }
}
