package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String fName = rd.readLine();
        rd.close();

        rd = new BufferedReader(new FileReader(fName));
        while (rd.ready()){
            char[] ch = rd.readLine().toCharArray();
            String s = "";
            for (int i = ch.length - 1; i >= 0; i--){
                s = s + ch[i];
            }
            System.out.println(s);
        }
        rd.close();
    }
}
