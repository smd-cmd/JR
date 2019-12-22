package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String fName = rd.readLine();
        rd.close();

        ArrayList<Integer> lst = new ArrayList<Integer>();
        FileInputStream fReader = new FileInputStream(fName);
        while (fReader.available() > 0){
            lst.add(fReader.read());
        }
        fReader.close();

        int count = Integer.MAX_VALUE;
        int numFreq;
        for (int n : lst){
            if ((numFreq = Collections.frequency(lst, n)) < count) count = numFreq;
        }

        HashSet<Integer> set = new HashSet<>();
        for (int n : lst){
            if ((Collections.frequency(lst, n)) == count) set.add(n);   //выводимые байты не должны повторяться, поэтому set
        }

        for (int n : set){
            System.out.print(n + " ");
        }

    }
}
