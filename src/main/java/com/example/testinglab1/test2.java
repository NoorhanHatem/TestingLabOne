package com.example.testinglab1;

import java.io.InputStream;
import java.util.Scanner;

public class test2 {
    public String solution (InputStream in){
        int sumx = 0;
        int sumy = 0;
        int sumz = 0;

        int[][] inputArr = new int[100][3];
        Scanner s = new Scanner(in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            inputArr[i][0] = s.nextInt();
            inputArr[i][1] = s.nextInt();
            inputArr[i][2] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sumx = sumx + inputArr[i][0];
            sumy = sumy + inputArr[i][1];
            sumz = sumz + inputArr[i][2];
        }
        if (sumx == 0 && sumy == 0 && sumz == 0) {
            return "YES";
        }else {
            return "NO";
        }
    }
}
