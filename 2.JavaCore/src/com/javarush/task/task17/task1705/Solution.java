package com.javarush.task.task17.task1705;

import java.util.ArrayList;
import java.util.List;

/* 
Сад-огород
*/

public class Solution {


    public static void main(String[] args) {

    }

    public static class Garden {

        public final List<String> fruits = new ArrayList<String>();
        public final List<String> vegetables = new ArrayList<String>();

        public synchronized void addFruit(int index, String fruit){
            try {
                fruits.add(index, fruit);
            }catch (IndexOutOfBoundsException e){
                System.out.println("Неверный индекс массива");
            }
        }
        public synchronized void removeFruit(int index){
            try{
                fruits.remove(index);
            }catch (IndexOutOfBoundsException e){
                System.out.println("Неверный индекс массива");
            }
        }

        public synchronized void addVegetable(int index, String vegetable){
            try {
                vegetables.add(index, vegetable);
            }catch (IndexOutOfBoundsException e){
                System.out.println("Неверный индекс массива");
            }
        }
        public synchronized void removeVegetable(int index){
            try{
                vegetables.remove(index);
            }catch (IndexOutOfBoundsException e){
                System.out.println("Неверный индекс массива");
            }
        }


    }
}
