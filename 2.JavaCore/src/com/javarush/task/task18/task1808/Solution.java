package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String fName1 = rd.readLine();
        String fName2 = rd.readLine();
        String fName3 = rd.readLine();
        rd.close();

        FileInputStream inpStream = new FileInputStream(fName1);
        FileOutputStream outStream1 = new FileOutputStream(fName2);
        FileOutputStream outStream2 = new FileOutputStream(fName3);
        int count = inpStream.available();
        if (count % 2 == 0){
            while (inpStream.available() > count/2){
                int n = inpStream.read();
                outStream1.write(n);
            }
            while (inpStream.available() > 0){
                int n = inpStream.read();
                outStream2.write(n);
            }
        }else{
            while (inpStream.available() > count/2){
                int n = inpStream.read();
                outStream1.write(n);
            }
            while (inpStream.available() > 0){
                int n = inpStream.read();
                outStream2.write(n);
            }
        }

        inpStream.close();
        outStream1.close();
        outStream2.close();

    }
}
