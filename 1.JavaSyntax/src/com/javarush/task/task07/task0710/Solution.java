package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> str = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
            str.add(0, rd.readLine());
        for (int i = 0; i < str.size(); i++)
            System.out.println( str.get(i) );
    }
}
