package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static java.lang.Double.parseDouble;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new FileReader(args[0]));
        Map<String, Double> table = new TreeMap<String, Double>();
        while (rd.ready()){
            String[] s = rd.readLine().split(" ");
            String name = s[0];
            double volume = parseDouble(s[1]);
            Double salary = table.get(name); // берем по ключу - фамилии значение зарплаты
            table.put(name, salary == null ? volume : salary + volume); // если фамилии в мапе еще не было, записываем ей зарплату
                                                                // а если было, то суммируем зарплату
        }
        rd.close();
        for (Map.Entry entry : table.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
