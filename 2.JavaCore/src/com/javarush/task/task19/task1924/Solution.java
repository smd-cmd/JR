package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Integer.parseInt;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static {
        map.put(0, "ноль"); map.put(1, "один"); map.put(2, "два"); map.put(3, "три"); map.put(4, "четыре");
        map.put(5, "пять"); map.put(6, "шесть"); map.put(7, "семь"); map.put(8, "восемь");
        map.put(9, "девять"); map.put(10, "десять"); map.put(11, "одиннадцать"); map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException  {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String fName = rd.readLine();
        rd.close();

        rd = new BufferedReader(new FileReader(fName));
        while (rd.ready()){
            String[] ln = rd.readLine().split(" ");

            boolean flag = false;
            for (int i = 0; i < ln.length; i++){
                //System.out.println(ln[i]);
                //int k = 0;
                if (ln[i].matches("^\\d+$")){
                    String vol = "";
                    if (map.get(parseInt(ln[i])) != null) vol = map.get(parseInt(ln[i]));
                    //System.out.println(vol + " --");
                    if (!vol.equals("")){
                        flag = true;
                        ln[i] = vol;
                        //System.out.println(ln[i] + " ln[i]");
                    }
                }
            }
            if (flag){
                for (String s: ln){
                    System.out.print(s + " ");
                }
            }
            System.out.println();
            flag = false;
        }
        rd.close();
    }
}
