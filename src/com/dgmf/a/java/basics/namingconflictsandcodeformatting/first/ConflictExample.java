package com.dgmf.a.java.basics.namingconflictsandcodeformatting.first;

// Error ==> Javac Don't Know What "Date" Class to Use
// import java.util.*;
// import java.sql.*;

import com.dgmf.MainBelowComDgmf;

import java.util.List;

public class ConflictExample {
    public static void main(String[] args) {
        // Date
        // FQN to Solve the Problem
        java.util.Date date;
        java.sql.Date sqlDate;

        // MainBelowSrc ==> We Can Not Import Classes Outside Default Packages
        MainBelowComDgmf mainBelowComDgmf = new MainBelowComDgmf();

    }

    public static void checkEmpty(List list) {
        if (list.isEmpty) {
            System.out.println("Empty");
        } else {
            System.out.println("Not Empty");
        }
    }
}
