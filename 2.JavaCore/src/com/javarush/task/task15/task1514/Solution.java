package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static  {
        labels.put(5.45, "один");
        labels.put(3.12, "два");
        labels.put(1.43, "три");
        labels.put(4.15, "четыре");
        labels.put(6.17, "пять");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
