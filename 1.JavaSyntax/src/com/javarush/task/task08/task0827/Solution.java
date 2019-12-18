package com.javarush.task.task08.task0827;

import java.util.Date;
import java.text.SimpleDateFormat;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {

        Date dt = new Date(date);
        SimpleDateFormat sdf = new SimpleDateFormat("D");
        int i = Integer.parseInt(sdf.format(dt));
        return i % 2 != 0;



    }
}
