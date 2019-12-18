package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        do {
            //System.out.println("Введите число n больше 0");
            n = Integer.parseInt(reader.readLine());

        }while(n <=0);

        int maximum = Integer.parseInt(reader.readLine());

        //напишите тут ваш код
        for (int i = 0; i < n-1; i++)
        {
            int num = Integer.parseInt(reader.readLine());
            if (maximum < num) { maximum = num; }
        }


        System.out.println(maximum);
    }
}
