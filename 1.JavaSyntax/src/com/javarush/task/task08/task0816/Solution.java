package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        map.put("Пупкин", dateFormat.parse("JUNE 2 2001"));
        map.put("Петров", dateFormat.parse("FEBRUARY 3 2003"));
        map.put("Васечкин", dateFormat.parse("JUNE 2 2001"));
        map.put("Лупкин", dateFormat.parse("NOVEMBER 5 2009"));
        map.put("Квакин", dateFormat.parse("DECEMBER 2 2007"));
        map.put("Укупник", dateFormat.parse("JUNE 2 2001"));
        map.put("Харитонов", dateFormat.parse("JULY 9 2005"));
        map.put("Маклай", dateFormat.parse("AUGUST 6 2001"));
        map.put("Маккейн", dateFormat.parse("JUNE 2 2001"));


        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        int mon;
        Iterator <Map.Entry<String, Date>> itr = map.entrySet().iterator();

        while (itr.hasNext())
        {
            Date date = itr.next().getValue();
            mon = date.getMonth();
            if (mon ==5 || mon == 6 || mon == 7) itr.remove();
        }


    }

    public static void main(String[] args) {

    }
}
