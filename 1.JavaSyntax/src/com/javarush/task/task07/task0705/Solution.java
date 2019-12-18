package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int[] bigArr = new int[20];
        int[] smallArr1 = new int[10];
        int[] smallArr2 = new int[10];

        for (int i = 0; i < bigArr.length; i++)
            bigArr[i] = Integer.parseInt(rd.readLine());
        for (int i = 0; i < 10; i++)
        {
            smallArr1[i] = bigArr[i];
            smallArr2[i] = bigArr[i+10];
        }
        for (int i = 0; i <10; i++)
            System.out.println(smallArr2[i]);
    }
}
