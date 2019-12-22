package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String fName = rd.readLine();
        rd.close();

        int minByte = Integer.MAX_VALUE;
        FileInputStream fReafer = new FileInputStream(fName);
        while (fReafer.available() > 0){
            int data = fReafer.read();
            if (minByte > data) minByte = data;
        }
        fReafer.close();
        System.out.println(minByte);
    }
}
