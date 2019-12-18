package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();

        int key_shot = 0, lngt, key_long = 0;


        for (int i = 0; i < 10; i++)
            strings.add(rd.readLine());

        lngt = strings.get(0).length();
        for (int i = 0; i < strings.size(); i++)
            if (strings.get(i).length() > lngt)
            {
                lngt = strings.get(i).length();
                key_long = i;
            }

        lngt = strings.get(0).length();
        for (int i = 0; i < strings.size(); i++)
            if (strings.get(i).length() < lngt)
            {
                lngt = strings.get(i).length();
                key_shot = i;
            }

        if (key_long < key_shot) System.out.println(strings.get(key_long));
        else System.out.println(strings.get(key_shot));
    }
}
