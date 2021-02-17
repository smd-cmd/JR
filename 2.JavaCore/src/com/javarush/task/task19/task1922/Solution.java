package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Double.parseDouble;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String fName = rd.readLine();
        rd.close();

        rd = new BufferedReader(new FileReader(fName));
        //Map<String, String> lines = new HashMap<String, String>(); // мапа для хранения слов и их частоты в каждой строке
        while (rd.ready()){
            String ln = rd.readLine();
            String[] str = ln.split(" ");
            int freq = 0;
            for (int i = 0; i < str.length; i++){
                for (int j = 0; j < words.size(); j++){
                    if (str[i].equals(words.get(j))) freq++;
                }
            }
            if (freq == 2){
                System.out.println(ln);
            }
        }
        rd.close();
    }
}
