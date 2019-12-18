package com.javarush.task.task15.task1525;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/


public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static {
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(Statics.FILE_NAME), StandardCharsets.UTF_8));
            String line;
            while ((line = reader.readLine()) != null ) lines.add(line);
            reader.close();
        }catch (IOException e){
            System.out.println("Ошибка чтения/записи");
        }




    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
