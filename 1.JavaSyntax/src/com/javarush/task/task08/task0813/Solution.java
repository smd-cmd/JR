package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Set;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код

        Set<String> setstr = new HashSet<String>();
        for (int i = 0; i < 20; i++)
            setstr.add("Л" + String.valueOf(i+1000));
        return setstr;


    }

    public static void main(String[] args) {

    }
}
