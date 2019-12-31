package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String fName = rd.readLine();
        rd.close();
        String id = args[0];

        rd = new BufferedReader(new FileReader(fName));
        String line = "";
        while ((line = rd.readLine()) != null){
            if (line.indexOf(id + " ") != -1) System.out.println(line);
        }
        rd.close();

    }
}
