package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader rd = new BufferedReader( new InputStreamReader(System.in));
        String fileName = rd.readLine();
        rd.close();
        ArrayList<Integer> numArr = new ArrayList<>();
        //int count = 0;
        //BufferedInputStream bufFileStream = new BufferedInputStream(new FileInputStream(fileName));
        BufferedReader bufFile = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        while (bufFile.ready()){

            int num = Integer.parseInt(bufFile.readLine());
            if (num % 2 ==0) numArr.add(num);
        }
        bufFile.close();
        Collections.sort(numArr);
        for (int x : numArr)
            System.out.println(x);
    }
}
