package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> str = new ArrayList<String>();
        String s;
        for (int i = 0; i < 5; i++)
            str.add(rd.readLine());
        for (int i = 0; i < 13; i++)
        {
            s = str.get(4);
            str.remove(4);
            str.add(0, s);

        }
        for (int i = 0; i < str.size(); i++)
            System.out.println(str.get(i));
    }
}
