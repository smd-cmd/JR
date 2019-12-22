package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String fName = rd.readLine();
        rd.close();

        int maxByte = 0;
        FileInputStream fReafer = new FileInputStream(fName);
        while (fReafer.available() > 0){
            int data = fReafer.read();
            if (maxByte < data) maxByte = data;
        }
        fReafer.close();
        System.out.println(maxByte);
    }
}
