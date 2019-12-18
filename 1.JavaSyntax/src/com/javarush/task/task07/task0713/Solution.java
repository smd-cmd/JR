package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> lst = new ArrayList<Integer>();
        ArrayList<Integer> lst3 = new ArrayList<Integer>();
        ArrayList<Integer> lst2 = new ArrayList<Integer>();
        ArrayList<Integer> lst23 = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++)
            lst.add(Integer.parseInt(rd.readLine()));

        for (int i = 0; i < lst.size(); i++)
        {
            int x = lst.get(i);
            if (x % 3 == 0) lst3.add(x);
            if (x % 2 == 0) lst2.add(x);
            if (x % 3 !=0 & x % 2 != 0) lst23.add(x);
        }
        printList(lst3);
        printList(lst2);
        printList(lst23);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer n : list)
            System.out.println(n);
    }
}
