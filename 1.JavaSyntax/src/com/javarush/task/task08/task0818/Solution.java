package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> mp = new HashMap<String, Integer>() {{
            put("Volkov", 300);
            put("Sedov", 245);
            put("Kolpakov", 600);
            put("Fedorov", 1050);
            put("Nikonov", 850);
            put("Belkin", 500);
            put("Stalin", 999);
            put("Brezhnev", 150);
            put("Putin", 400);
            put("Haritonov", 650);
        }};
        return mp;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator <Map.Entry<String, Integer>> itr = map.entrySet().iterator();

        while (itr.hasNext())
        {
            int sal = itr.next().getValue();

            if (sal < 500) itr.remove();
        }

    }

    public static void main(String[] args) {

    }
}