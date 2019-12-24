package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String fName1 = rd.readLine();
        String fName2 = rd.readLine();
        rd.close();

        int num = 256;
        FileInputStream inStream = new FileInputStream(fName1);
        FileOutputStream outStream = new FileOutputStream(fName2);
        byte[] bfr = new byte[num];
        while (inStream.available() > 0){
            int count = inStream.read(bfr) - 1;
            for (int i = 0; i <= (count+1)/2; i++){
                byte n = bfr[i];
                bfr[i] = bfr[count - i];
                bfr[count - i] = n;
            }
            outStream.write(bfr, 0, count + 1);
        }
        inStream.close();
        outStream.close();
    }
}
