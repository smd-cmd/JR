package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();
        ArrayList<Integer> index = new ArrayList<Integer>();
        //String s1 = new String();
        int key = 0, lngt = 0;

        for (int i = 0; i < 5; i++)
            strings.add(rd.readLine());

        for (int i = 0; i < strings.size(); i++)
        {
            if (strings.get(i).length() > lngt)
            {
                lngt = strings.get(i).length();
                key = i;
            }

        }
        System.out.println(strings.get(key));
        for (int i = 0; i < strings.size(); i++)
            if (strings.get(i).length() == strings.get(key).length() & i !=key)
                System.out.println(strings.get(i));



    }
}
