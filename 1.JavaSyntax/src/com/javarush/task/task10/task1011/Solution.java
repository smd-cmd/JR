package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        //напишите тут ваш код
        char[] chS = new char[40];
        chS = s.toCharArray();

        for (byte i = 0; i < 40; i++) {
            for (byte j = i; j < chS.length; j++)
                System.out.print(chS[j]);
            System.out.println();
        }
    }

}

