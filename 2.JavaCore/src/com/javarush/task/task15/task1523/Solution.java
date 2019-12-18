package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    public static void main(String[] args) {

    }

    public Solution(){
        System.out.println("Максимальный доступ!");
    }

    Solution(String s){
        System.out.println("в пределах пакета " +s);
    }
    private Solution(int i){
        System.out.println("Доступ ограничен! " + i);
    }
    protected Solution(double d){
        System.out.println("Только для потомков! " + d);
    }
}

