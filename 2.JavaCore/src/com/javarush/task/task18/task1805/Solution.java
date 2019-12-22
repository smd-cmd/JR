package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String fName = rd.readLine();
        rd.close();

        TreeSet<Integer> set = new TreeSet<>();
        FileInputStream fReader = new FileInputStream(fName);
        while (fReader.available() > 0){
            set.add(fReader.read());
        }
        fReader.close();

        for (int n : set) System.out.print(n + " ");
    }
}
