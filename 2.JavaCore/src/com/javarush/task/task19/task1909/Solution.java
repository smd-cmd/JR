package com.javarush.task.task19.task1909;

/* 
Замена знаков
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

        String result = s.replace('.', '!');
        BufferedWriter fWriter = new BufferedWriter(new FileWriter(fileNameOut));
        fWriter.write(result);
        fWriter.close();
    }
}
