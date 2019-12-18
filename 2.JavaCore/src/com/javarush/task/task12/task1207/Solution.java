package com.javarush.task.task12.task1207;

/* 
Int и Integer
*/

public class Solution {
    public static void main(String[] args) {

        print(20);
        print(new Integer(20));

    }

    //Напишите тут ваши методы
    static void print(int x){
        System.out.println(x);
    }

    static void print(Integer y){
        System.out.println(y);
    }
}
