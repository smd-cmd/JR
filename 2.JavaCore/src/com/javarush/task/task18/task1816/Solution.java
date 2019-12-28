package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        int bfSize = 16;
        int countEngChar = 0;
        FileInputStream inStream = new FileInputStream(args[0]);
        byte[] bf = new byte[bfSize];
        while (inStream.available() > 0){
            int count = inStream.read(bf);
            for (int i = 0; i < count; i++) {
                if ((bf[i] >= 65 & bf[i] <= 90) | (bf[i] >= 97 & bf[i] <= 122)) countEngChar++;
            }
        }
        inStream.close();
        System.out.println(countEngChar);

    }
}
