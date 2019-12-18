package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int n;

        if (a < b) {
            n = a;
            a = b;
            b = n;
        }
        if (b < c){
            n = b;
            b = c;
            c = n;
        }
        if (a < c){
            n = a;
            a = c;
            c = n;
        }
        if (a < b) {
            n = a;
            a = b;
            b = n;
        }
        System.out.println(a + " " + b + " " +c);
    }
}
