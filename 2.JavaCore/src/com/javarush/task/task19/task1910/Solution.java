package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String fileNameIn = rd.readLine();
        String fileNameOut = rd.readLine();
        rd.close();

        BufferedReader fReader = new BufferedReader(new FileReader(fileNameIn));
        String s = "";

        while (fReader.ready()){
            s += fReader.readLine();
        }
        fReader.close();

        String result = s.replaceAll("\\p{IsPunctuation}", ""); // "\\p{IsPunctuation}" - регулярка для знаков пунктуации
        BufferedWriter fWriter = new BufferedWriter(new FileWriter(fileNameOut));
        fWriter.write(result);
        fWriter.close();
    }
}
