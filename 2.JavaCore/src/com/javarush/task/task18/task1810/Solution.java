package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        do{
            BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
            String fName = rd.readLine();
            FileInputStream inStream = new FileInputStream(fName);
            byte[] bf = new byte[1000];
            int count = inStream.read(bf);
            if (count < 1000){
                inStream.close();
                throw new DownloadException();
            }
        }while (true);
    }

    public static class DownloadException extends Exception {

    }
}
