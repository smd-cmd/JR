package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> lstInt = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            lstInt.add(Integer.parseInt(rd.readLine()));
        int count1 = 1, count2 = 1;
        for (int i = 0; i < lstInt.size() - 1; i++) {
            if (lstInt.get(i).equals(lstInt.get(i + 1))) count1++;
            else if (count2 <= count1){
                count2 = count1;
                count1 = 1;
            }
            else count1 = 1;
        }
        if (count2 < count1) count2 = count1;

        System.out.println(count2);


    }
}