package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedInputStream inStream = new BufferedInputStream(new FileInputStream(args[0]));
        byte[] bf = new byte[inStream.available()];
        inStream.read(bf);
        inStream.close();
        int[] chars = new int[128];


        for (int i = 0; i < bf.length; i++) {
            char c = (char) bf[i];
            chars[c]++;
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 0) {
                System.out.println((char) i + " " + chars[i]);
            }
        }


    }
}
