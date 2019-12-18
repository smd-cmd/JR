package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> strs = new ArrayList<String>();
        String s;
        for (int i = 0; i < 1;)
        {
            s = reader.readLine();
            if (s.equals("end")) break;
            else strs.add(s);
        }
        for (String x : strs)
            System.out.println(x);
    }
}