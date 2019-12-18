package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int i = 0;
        int j = 0;
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a>0) i++;
        else if (a<0) j++;
        int b = Integer.parseInt(reader.readLine());
        if (b>0) i++;
        else if (b<0) j++;
        int c = Integer.parseInt(reader.readLine());
        if (c>0) i++;
        else if (c<0) j++;

        System.out.println("количество отрицательных чисел: " + j);
        System.out.println("количество положительных чисел: " + i);

    }
}
