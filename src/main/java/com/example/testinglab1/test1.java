package com.example.testinglab1;

import java.util.Scanner;

public class test1 {
    public static String watermelon(int w) {
        if (w % 2 != 0) {
            return "NO";
        } else if (w == 2) {
            return "NO";
        } else {
            return "YES";
        }
    }
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        String x = watermelon(w);
        System.out.println(x);
    }
}

