package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String fName1 = rd.readLine();
        String fName2 = rd.readLine();
        String fName3 = rd.readLine();
        rd.close();

        int bfSize = 64;
        boolean append = true;

        FileOutputStream outStream = new FileOutputStream(fName1, append);
        FileInputStream inStream1 = new FileInputStream(fName2);
        FileInputStream inStream2 = new FileInputStream(fName3);
        byte[] bf = new byte[bfSize];

        while (inStream1.available() > 0){
            int count = inStream1.read(bf);
            outStream.write(bf, 0, count);
        }
        inStream1.close();

        while (inStream2.available() > 0){
            int count = inStream2.read(bf);
            outStream.write(bf, 0, count);
        }
        inStream2.close();
        outStream.close();
    }
}
