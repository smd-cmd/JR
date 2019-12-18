package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> str = new ArrayList<String>();
        for (int i = 0; i < 5; i++)
            str.add(rd.readLine());

        str.remove(2);
        for (int i = str.size()-1; i >= 0; i--)
            System.out.println(str.get(i));
    }
}
