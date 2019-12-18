package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        int sum = 0;
        while (num != -1)
        {
            num = Integer.parseInt(rd.readLine());
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
