package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    private BufferedOutputStream outStream;

    public static void main(String[] args) throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String fName1 = rd.readLine();
        String fName2 = rd.readLine();
        rd.close();

        BufferedInputStream inStream1 = new BufferedInputStream(new FileInputStream(fName1));    //содержимое 1 и 2 файла в массивы-буферы
        BufferedInputStream inStream2 = new BufferedInputStream(new FileInputStream(fName2));
        byte[] bf1 = new byte[inStream1.available()];
        inStream1.read(bf1);
        byte[] bf2 = new byte[inStream2.available()];
        inStream2.read(bf2);

        inStream1.close();
        inStream2.close();

        BufferedOutputStream outStream = new BufferedOutputStream(new FileOutputStream(fName1));  //пишем оба буфера в 1 файл в нужной послед-ти
        outStream.write(bf2);
        outStream.write(bf1);

        outStream.close();

    }
}
