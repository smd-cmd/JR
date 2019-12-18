package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> mp = new HashMap<String, String>();
        mp.put("Volkov", "Ivan");
        mp.put("Sedov", "Petr");
        mp.put("Kolpakov", "Fedor");
        mp.put("Fedorov", "Sergei");
        mp.put("Nikonov", "Alexander");
        mp.put("Belkin", "Fedor");
        mp.put("Kozlov", "Iosif");
        mp.put("Brezhnev", "Leo");
        mp.put("Sedov", "Fedor");
        mp.put("Haritonov", "Fedor");

        return mp;

        //return null;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
