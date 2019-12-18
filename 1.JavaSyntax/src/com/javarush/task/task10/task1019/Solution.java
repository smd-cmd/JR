package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        while (true){
            String endOfInput = reader.readLine();
            if (endOfInput.equals("")) break;
            int id = Integer.parseInt(endOfInput);
            String name = reader.readLine();
            map.put(name, id);
            if (name.equals("")) break;

        }

        for (HashMap.Entry<String, Integer> pair : map.entrySet())
            System.out.println(pair.getValue() + " " + pair.getKey());
    }
}
