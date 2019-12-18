package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> lst = new ArrayList<String>();
        for (int i = 0; i<5; i++)
            lst.add("blablabla");
        /*lst.set(1, "blablabla1");
        lst.set(2, "blablabla1");
        lst.set(3, "blablabla1");
        lst.set(4, "blablabla1");*/
        System.out.println(lst.size());
        for (int i = 0; i < 5; i++) System.out.println(lst.get(i));
    }
}
