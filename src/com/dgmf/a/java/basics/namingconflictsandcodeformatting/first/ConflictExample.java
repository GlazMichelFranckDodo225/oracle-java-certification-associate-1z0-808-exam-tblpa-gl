package com.dgmf.a.java.basics.namingconflictsandcodeformatting.first;

// Error ==> Javac Don't Know What "Date" Class to Use
// import java.util.*;
// import java.sql.*;

public class ConflictExample {
    public static void main(String[] args) {
        // Date
        // FQN to Solve the Problem
        java.util.Date date;
        java.sql.Date sqlDate;
    }
}
