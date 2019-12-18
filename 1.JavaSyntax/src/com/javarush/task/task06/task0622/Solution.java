package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int range = 5;
        int k;
        int[] nums = new int[range];

        for (int i = 0; i<range; i++)
            nums[i] = Integer.parseInt(reader.readLine());

        for (int j = range-1; j >=1; j--)
            for (int i = 0; i < j; i++)
                if (nums[i] > nums[i+1])
                {
                    k = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = k;
                }
        //System.out.println();
        for (int i = 0; i < range; i++)
            System.out.println(nums[i]);


    }
}
