package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код
        int[] symbAtStr = new int[33]; // массив - счетчик вхождения символов в исходный list
        for (byte i = 0; i < 33; i++)   //инициализируем его нулями
            symbAtStr[i] = 0;

        for (String x : list)   //цикл над list'ом,
        {
            char[] chArr = x.toCharArray();     //каждую строку list'а преобразум в массив символов
            for (int i = 0; i < chArr.length; i++)  //и вложенным циклом проверяем вхождение каждой буквы в этот массив
                for (byte j = 0; j < 33; j++)
                    if (alphabet.get(j) == chArr[i]) symbAtStr[j]++;
        }

        for (byte k = 0; k < 33; k++)
            System.out.println(alphabet.get(k) + " " + symbAtStr[k]);
    }
}
