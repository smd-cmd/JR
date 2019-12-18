package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {11, 663};
        int[] arr3 = {15, 17, 25, 64};
        int[] arr4 = {21, 22, 23, 24, 25, 0, 27};
        int[] arr5 = new int[0];

        ArrayList<int[]> arr_int = new ArrayList<>();
        arr_int.add(arr1);
        arr_int.add(arr2);
        arr_int.add(arr3);
        arr_int.add(arr4);
        arr_int.add(arr5);

        return arr_int;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
