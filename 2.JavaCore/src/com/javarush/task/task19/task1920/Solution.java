package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.Key;
import java.util.*;

import static java.lang.Double.parseDouble;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new FileReader(args[0]));
        Map<String, Double> table = new HashMap<>();
        while (rd.ready()){
            String[] s = rd.readLine().split(" ");
            String name = s[0];
            double volume = parseDouble(s[1]);
            Double salary = table.get(name);
            table.put(name, salary == null ? volume : salary + volume);
        }
        rd.close();

        double maxValueInMap = Collections.max(table.values());
        for (Map.Entry<String, Double> entry : table.entrySet()) {
            if (maxValueInMap == entry.getValue()) {
                System.out.println(entry.getKey());
            }
        }
    }

}
