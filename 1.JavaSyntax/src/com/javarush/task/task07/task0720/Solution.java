package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> str = new ArrayList<String>();
        ArrayList<String> bufstr = new ArrayList<String>();
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++)
            str.add(reader.readLine());
        /*for (int i = 0; i < M; i++)         //считываем M первых строк и забиваем в буф.список
            bufstr.add(str.get(i));
        for (int i = 0; i < N - M; i++)     //перезаписываем оставшиеся строки в начало списка
            str.set(i, str.get(i + M));
        for (int i = N - M; i < N; i++)         //перезаписываем M первых строк из буф.списка в конец списка
            str.set(i, bufstr.get(i-(N-M)));*/
        for (int i = 0; i < M; i++)
            str.add(i + N, str.get(i));
        for (int i = 0; i < M; i++)
            str.remove(0);

        for (String s : str)
            System.out.println(s);




    }
}
