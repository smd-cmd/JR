package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код
        int[] nums = new int[20];

        for (int i = 0; i < 20; i++)
            nums[i] = Integer.parseInt(reader.readLine());

        maximum = minimum = nums[0];
       // minimum = nums[0];

        for (int i = 0; i < nums.length-1; i++)
        {

            if (minimum > nums[i+1]) minimum = nums[i+1];
            if (maximum < nums[i+1]) maximum = nums[i+1];
        }

        System.out.print(maximum + " " + minimum);
    }
}
