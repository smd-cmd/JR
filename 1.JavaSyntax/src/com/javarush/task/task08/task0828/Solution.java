package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;
//import java.util.Set;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        HashMap<String, Integer> monthsLst = new HashMap<>();
        monthsLst.put("January", 1);
        monthsLst.put("February", 2);
        monthsLst.put("March", 3);
        monthsLst.put("April", 4);
        monthsLst.put("May", 5);
        monthsLst.put("June", 6);
        monthsLst.put("July", 7);
        monthsLst.put("August", 8);
        monthsLst.put("September", 9);
        monthsLst.put("October", 10);
        monthsLst.put("November", 11);
        monthsLst.put("December", 12);
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String key = rd.readLine();
        if (monthsLst.containsKey(key)) System.out.println(key + " is the " + monthsLst.get(key) + " month" );
    }
}
