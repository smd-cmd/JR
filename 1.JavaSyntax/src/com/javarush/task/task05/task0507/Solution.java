package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int num = 0;
        double result = 0;
        while (num != -1)
        {
            num = Integer.parseInt(rd.readLine());
            result = result + num;
            count++;
        }
        //result = (result + 1)/count;
        System.out.println((result+1)/(count-1));

    }
}

