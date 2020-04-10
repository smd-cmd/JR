package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String fileNameIn = rd.readLine();
        rd.close();

        FileReader fReader = new FileReader(fileNameIn);
        int count = 0;
        String s = "";
        while (fReader.ready()){
            count = fReader.read();
            s += (char)count;
        }
        fReader.close();
        count = 0;
        if (s.contains("world")){
            // split(regexp) - разбивает строку на подстроки по регулярному выражению, в данном случае по знакам препинания
            for (String w : s.split("[-,.:;\\r\\n!? ]")){
                // trim() - убирает пробелы в начале и конце строки
                if (w.trim().equals("world")) count++;
            }
        }
        System.out.println(count);

    }
}
