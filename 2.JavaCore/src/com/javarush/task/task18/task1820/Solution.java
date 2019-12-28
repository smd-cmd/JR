package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String fName1 = rd.readLine();
        String fName2 = rd.readLine();
        rd.close();

        BufferedInputStream inStream = new BufferedInputStream(new FileInputStream(fName1));
        int bfSize = inStream.available();
        byte bf[] = new byte[bfSize];
        List<Integer> res = new ArrayList<>();
        inStream.read(bf);
        String numStr = "";
        for (byte i = 0; i < bfSize; i++) {             //парсим в integer arraylist, округляя из float
            if (bf[i] != 32) numStr += (char)bf[i];
            else {
                res.add(Math.round(Float.parseFloat(numStr)));
                numStr = "";
            }
        }
        if (bf[bfSize - 1] !=32) res.add(Math.round(Float.parseFloat(numStr))); //дописываем последнее значение, если файл не заканч. на пробел
        inStream.close();

        BufferedOutputStream outStream = new BufferedOutputStream(new FileOutputStream(fName2));
        for (int d : res){          //пишем каждое число, преобразуя в строку, а затем в байт-код
            String out = d + " ";
            byte[] b = out.getBytes();
            outStream.write(b);
        }
        outStream.close();


    }
}
