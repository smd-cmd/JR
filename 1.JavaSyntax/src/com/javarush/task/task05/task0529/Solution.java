package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String s = rd.readLine();
        int res = 0;
        while (!s.equals("сумма"))
        {
            res = res + Integer.parseInt(s);
            s = rd.readLine();
        }
        System.out.println(res);
    }
}
