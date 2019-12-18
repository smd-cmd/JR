package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> num = new ArrayList<Integer>();
        //int i = 0;
        while (true){
            try {
                num.add(Integer.parseInt(rd.readLine()));
            }catch (NumberFormatException e){
                for (Integer n : num)
                    System.out.println(n);
                return;
            }catch (IOException e){

            }
        }
    }
}
