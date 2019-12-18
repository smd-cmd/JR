package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //напишите тут ваш код
        /*
        int space0 = string.indexOf(' '); //позиция пробела перед первым словом
        int count0 = 0; // счетчик пробелов перед первым словом
        if (space0 == 0) {  //если пробел есть (на нулевой позиции)

            while (string.substring(space0 + count0, space0 + count0 + 1).equals(" ")) //тогда считаем количество пробелов
                count0++;
        } else space0 = 0;


        int space1 = string.indexOf(' ', space0 + count0 + 1); //позиция пробела в строке между 1 и 2 словом
        int count1 = 0; //количество пробелов между 1 и 2 словом
        while (string.substring(space1 + count1, space1 + count1 + 1).equals(" ")) //вычисляем количество пробелов
            count1++;
        int space2 = string.indexOf(' ', space1 + count1 + 1); //позиция пробела в строке между 2 и 3 словом
        int count2 = 0; //количество пробелов между 2 и 3 словом
        while (string.substring(space2 + count2, space2 + count2 + 1).equals(" "))//вычисляем количество пробелов
            count2++;
        String sp_str0 = string.substring(space0, space0 + count0); // подстрока из пробелов перед 1 словом

        String word1 = string.substring(space0 + count0, space1); // подстрока -  первое слово (до пробела)
        String sp_str1 = string.substring(space1, space1 + count1); //подстрока из пробелов между 1 и 2 словом
        String word2 = string.substring(space1 + count1, space2); //подстрока -  второе слово (от до пробела);
        String sp_str2 = string.substring(space2, space2 + count2); //подстрока из пробелов между 2 и 3 словом
        String word3 = string.substring(space2 + count2); //третье слово (подстрокой от второго пробела до конца строки)

        string = sp_str0 + word1.substring(0, 1).toUpperCase() + word1.substring(1) + sp_str1 + word2.substring(0, 1).toUpperCase()
                + word2.substring(1) + sp_str2 + word3.substring(0, 1).toUpperCase() + word3.substring(1);

        System.out.println(string); */
        char[] ch_arr = string.toCharArray();
        char space = ' ';
        for (int i = 0; i < ch_arr.length; i++)
            if (ch_arr[i] == space && ch_arr[i+1] != space) //проверка границы - слово начинается, когда перед ним пробел
                ch_arr[i+1] = Character.toUpperCase(ch_arr[i+1]); //тогда заменяем первый символ на заглавную букву
            else if (i == 0) ch_arr[i] = Character.toUpperCase(ch_arr[i]);  //условие, когда до первого слова нет пробелов

        for (char c : ch_arr)
            System.out.print(c);
    }
}
