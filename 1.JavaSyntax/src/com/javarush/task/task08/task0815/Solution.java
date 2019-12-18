package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> mp = new HashMap<String, String>() {{
            put("Volkov", "Ivan");
            put("Sedov", "Petr");
            put("Kolpakov", "Fedor");
            put("Fedorov", "Sergei");
            put("Nikonov", "Alexander");
            put("Belkin", "Fedor");
            put("Stalin", "Iosif");
            put("Brezhnev", "Leo");
            put("Putin", "Fedor");
            put("Haritonov", "Fedor");
        }};
        return mp;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (String val : map.values())
            if (val.equals(name)) count++;
        return count;

    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (String val : map.keySet())
            if (val.equals(lastName)) count++;
        return count;

    }

    public static void main(String[] args) {

    }
}
