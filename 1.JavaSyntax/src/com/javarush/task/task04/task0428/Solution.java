package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int i = 0;
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a>0) i++;
        int b = Integer.parseInt(reader.readLine());
        if (b>0) i++;
        int c = Integer.parseInt(reader.readLine());
        if (c>0) i++;

        System.out.println(i);

    }
}
