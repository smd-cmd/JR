package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        int n = 5;
        ArrayList<String>[] arrList = new ArrayList[n];
        ArrayList<String> strList = new ArrayList<String>();
        String s = "";
        for (byte k = 0; k < n; k++) {
            for (byte i = 0; i < 5; i++) {
                for (byte j = 0; j < 20; j++)
                    s = s + Byte.toString(j);
                s = s + " " + i;
                strList.add(s);
                s = "";
            }
            arrList[k] = strList;
        }

        return arrList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}