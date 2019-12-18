package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

/* 
Нам повторы не нужны
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Set<String> names = new HashSet<String>();
        Set<String> dubnames = new HashSet<String>();
        for (Map.Entry<String, String> x : map.entrySet())
        {
            String name = x.getValue();
            if (names.contains(name)) dubnames.add(name);
            else names.add(name);
        }
        for (String n : dubnames)
            removeItemFromMapByValue(map, n);

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
