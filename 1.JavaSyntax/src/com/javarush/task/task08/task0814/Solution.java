package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> intset = new HashSet<Integer>();
        for (int i = 0; i < 20; i++)
            intset.add(i);
        return intset;

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Set<Integer> subset = new HashSet<Integer>();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext())
        {
            Integer n = iterator.next();
            if (n > 10) subset.add(n);

        }
        set.removeAll(subset);
        return set;

    }

    public static void main(String[] args) {

    }
}
