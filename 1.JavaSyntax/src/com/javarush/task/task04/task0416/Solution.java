package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Double t = Double.parseDouble(reader.readLine());
        for (int i = 0; i <=11; i++)
        {
            if (t >= 5*i & t < 5*i+3) System.out.println("зелёный");
            else if (t >= 5*i+3 & t < 5*i+4) System.out.println("жёлтый");
            else if (t >= 5*i+4 & t < 5*i+5) System.out.println("красный");
        }
    }
}