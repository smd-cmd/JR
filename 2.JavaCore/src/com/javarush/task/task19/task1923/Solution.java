package com.javarush.task.task19.task1923;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new FileReader(args[0]));
        BufferedWriter wr = new BufferedWriter(new FileWriter(args[1]));
        while (rd.ready()){
            String ln = rd.readLine();
            String[] str = ln.split(" ");
            //Pattern p = Pattern.compile(".*\\d+.*");

            for (String s : str){
                //Matcher m = p.matcher(s);
                if (s.matches(".*\\d+.*")) wr.write(s + " ");
            }

        }
        rd.close();
        wr.close();
    }
}
