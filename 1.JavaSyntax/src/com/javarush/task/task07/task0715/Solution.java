package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> str = new ArrayList<String>();
        str.add("мама");
        str.add("мыла");
        str.add("раму");
        for (int i = 0; i < 6; i++)
            if (i % 2 !=0) str.add(i,"именно");
        for (String s : str)
            System.out.println(s);
    }
}
