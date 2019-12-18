package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader (new InputStreamReader(System.in));
        String s = rd.readLine();
        int n = 0;
        even = 0;
        odd = 0;
        for (int i = 0; i < s.length(); i++)
        {
            //char ch = s.charAt(i);
            n = Character.digit(s.charAt(i), 10);
            if (n%2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
