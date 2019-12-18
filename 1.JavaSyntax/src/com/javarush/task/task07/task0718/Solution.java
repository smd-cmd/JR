package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        BufferedReader rd = new BufferedReader (new InputStreamReader (System.in));
        ArrayList<String> lst = new ArrayList<String>();

        for (int i = 0; i < 10; i++)
            lst.add(rd.readLine());

        for (int i = 0; i < lst.size() - 1; i++)
            if (lst.get(i).length() >= lst.get(i+1).length())
            {
                System.out.println(i+1);
                break;
            }
    }
}

