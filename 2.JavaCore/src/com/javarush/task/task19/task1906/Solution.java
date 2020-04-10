package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String fileNameIn = rd.readLine();
        String fileNameOut = rd.readLine();
        rd.close();

        FileReader fReader = new FileReader(fileNameIn);
        FileWriter fWriter = new FileWriter(fileNameOut);
        int count = 1;
        while (fReader.ready()){
            int data = fReader.read();
            if (count % 2 == 0) fWriter.write(data);
            count++;
        }
        fReader.close();
        fWriter.close();

    }
}
