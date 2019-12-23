package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String fName = rd.readLine();

        FileInputStream inpStream = new FileInputStream(fName);
        byte[] buff = new byte[256];
        int count = 0;
        while (inpStream.available() > 0){
            inpStream.read(buff);
            for (int n : buff)
                if (n == 44) count++;
        }
        System.out.println(count);
        inpStream.close();
    }
}
