package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/

public class Solution {

    public static Map<String, String> runtimeStorage = new HashMap<>();

    public static void save(OutputStream outputStream) throws Exception {
        //напишите тут ваш код
        Properties prop = new Properties();
        prop.putAll(runtimeStorage);
        prop.store(outputStream, null);

    }

    public static void load(InputStream inputStream) throws IOException {
        //напишите тут ваш код
        Properties prop = new Properties();
        prop.load(inputStream);
        for (Map.Entry p : prop.entrySet()){
            runtimeStorage.put((String) p.getKey(), (String) p.getValue());
        }
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine())) {
            load(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}
