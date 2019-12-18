package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int[] homes = new int[15];
        int odd_count = 0, even_count = 0, count = 0;
        for (int i = 0; i < homes.length; i++)
        {
            homes[i] = Integer.parseInt(rd.readLine());
            if ( i % 2 == 0) even_count = even_count + homes[i];
            else odd_count = odd_count + homes[i];
        }
        if (odd_count > even_count) System.out.println("В домах с нечетными номерами проживает больше жителей.");
        if (even_count > odd_count) System.out.println("В домах с четными номерами проживает больше жителей.");


    }
}
