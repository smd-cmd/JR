package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        while (true){
            fileName = rd.readLine();
            try{
                FileInputStream inStream = new FileInputStream(fileName);
                inStream.close();
            }catch (FileNotFoundException e){
                System.out.println(fileName);
                break;
            }

        }
        rd.close();

    }
}
