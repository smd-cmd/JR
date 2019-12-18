package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код

        int ch1, ch2;
        //String s;
        for (int i = 0; i < strings.size(); i++)
        {
            ch1 = strings.get(i).indexOf('р');
            ch2 = strings.get(i).indexOf('л');
            //s = strings.get(i);
            if (ch1 != -1 & ch2 == -1) {strings.remove(i); i--;}
            if (ch2 != -1 & ch1 == -1) {strings.add(i, strings.get(i)); i++;}
        }
        return strings;
    }
}