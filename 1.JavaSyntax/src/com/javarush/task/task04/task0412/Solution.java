package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numb = reader.readLine();
        int number = Integer.parseInt(numb);
        if (number > 0) System.out.println(number*2);
        else if (number < 0) System.out.println((number + 1));
        else System.out.println(0);
    }

}