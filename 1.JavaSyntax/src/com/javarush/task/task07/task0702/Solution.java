package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] sArr = new String[10];
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < sArr.length-2; i++)
            sArr[i] = rd.readLine();
        for (int i = sArr.length-1; i >= 0; i--)
            System.out.println(sArr[i]);
    }
}