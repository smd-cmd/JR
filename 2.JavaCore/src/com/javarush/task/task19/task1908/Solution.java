package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String fileNameIn = rd.readLine();
        String fileNameOut = rd.readLine();
        rd.close();

        BufferedReader fReader = new BufferedReader(new FileReader(fileNameIn));
        int count = 0;
        String s = "";
        //чтение содержимого файла в строку
        while (fReader.ready()){
            //count = fReader.read();
            //s += (char)count;
            s += fReader.readLine();
        }
        fReader.close();

        Pattern numPattern = Pattern.compile("[0-9]+"); //задаем пттерн регулярного выражения - только цифры
        Matcher numMatcher = null;
        BufferedWriter fWriter = new BufferedWriter(new FileWriter(fileNameOut));
        // разбиваем на подстроки, в качестве разделителя пробел
        for (String w : s.split("[ ]")){
            // trim() - убирает пробелы в начале и конце строки
            String result = w.trim();
            numMatcher = numPattern.matcher(result);
            // проверка, что подстрока состоит только из знаков паттерна (цифр) и она не начинается с нуля
            if (numMatcher.matches() & result.indexOf("0") != 0){
                result += " ";
                fWriter.write(result);
            }
        }
        fWriter.close();

        //System.out.println(count);
    }
}
