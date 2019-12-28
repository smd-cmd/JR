package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws IOException {
        int bfSize = 8;
        int spaceCount = 0;
        int symbolCount = 0;
        FileInputStream inStream = new FileInputStream(args[0]);
        byte[] bf = new byte[bfSize];
        while (inStream.available() > 0){
            int n = inStream.read(bf);
            symbolCount += n;
            for (int i = 0; i < n; i++) {
                if (bf[i] == 32) spaceCount++;
            }
        }
        inStream.close();
        //System.out.println(symbolCount + " " + spaceCount);
        System.out.printf("%.2f", (double)spaceCount * 100/symbolCount);
    }
}
