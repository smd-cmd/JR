package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String s = rd.readLine();
        String s_out1 = "";
        String s_out2 = "";
        char[] charray = s.toCharArray();
        for (int i = 0; i < s.length(); i++)
            if (isVowel(charray[i])) s_out1 = s_out1 + charray[i] + " ";
            else if (charray[i] != ' ') s_out2 = s_out2 + charray[i] + " ";

        System.out.println(s_out1);
        System.out.println(s_out2);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}