package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new FileReader(args[0]));
        BufferedWriter wr = new BufferedWriter(new FileWriter(args[1]));
        String line = "";
        //StringBuilder sb = new StringBuilder();
        while (rd.ready()){
            String[] words = rd.readLine().split(" ");
            for(String s : words){
                if (s.length() > 6) line = line + s +",";
            }
        }
        rd.close();
        line = line.substring(0, line.length() - 1);
        wr.write(line);
        wr.close();
    }
}
