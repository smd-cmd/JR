package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            /*if (isNumber(s)) numIndex++;
            else strIndex++;*/
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    /*public static int numIndex = 0;
    public static int strIndex = 0;*/

    public static void sort(String[] array) {
        // напишите тут ваш код
        int numIndex = 0, strIndex = 0;

        for (int i = 0; i < array.length; i++) //вычислянм количество строк и чисел в массиве
            if (isNumber(array[i])) numIndex++;
            else strIndex++;

        int[] num_index = new int[numIndex];
        int[] str_index = new int [strIndex];
        int st = 0, n = 0;
        for (int i = 0; i < array.length; i++) //сохраняем индексы с числами в отдельный массив
            if (isNumber(array[i])) {
                num_index[n] = i;
                n++;
            }else {
                str_index[st] = i;   //а со строками в свой
                st++;
            }

        String stemp;
        //int itemp;
        for (int i = numIndex-1; i>=1; i--) // пузырёк по индексам чисел
            for (int j = 0; j<i; j++)
                if (Integer.parseInt(array[num_index[j + 1]]) > Integer.parseInt(array[num_index[j]])) {
                    stemp = array[num_index[j + 1]];
                    array[num_index[j + 1]] = array[num_index[j]];
                    array[num_index[j]] = stemp;
                }

        for (int i = strIndex-1; i>=1; i--) //пузырёк по индексам строк
            for (int j = 0; j<i; j++)
                if (isGreaterThan(array[str_index[j]], array[str_index[j+1]])){
                    stemp = array[str_index[j]];
                    array[str_index[j]] = array[str_index[j+1]];
                    array[str_index[j+1]] = stemp;
                }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
