package com.javarush.task.task14.task1420;


import java.io.IOException;
import java.io.*;
/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int x = 0, y = 0;
        try{
            x = Integer.parseInt(rd.readLine());
            y = Integer.parseInt(rd.readLine());
            if(x <= 0 || y <= 0) throw new NumberFormatException("Числа должны быть положительными целыми.");
        }catch (IOException e){
            System.out.println(e);
        }
        while (y !=0) {
            int tmp = x%y;
            x = y;
            y = tmp;
        }
        System.out.println(x);
    }
}
