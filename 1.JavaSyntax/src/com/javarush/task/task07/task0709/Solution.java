package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();

        int key = 0, lngt;

        for (int i = 0; i < 5; i++)
            strings.add(rd.readLine());

        lngt = strings.get(0).length();
        for (int i = 0; i < strings.size(); i++)
        {
            if (strings.get(i).length() < lngt)
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
