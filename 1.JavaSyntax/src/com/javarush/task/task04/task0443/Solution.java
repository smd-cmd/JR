package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String name = rd.readLine();
        String y = rd.readLine();
        String m = rd.readLine() + ".";
        String d = rd.readLine() + ".";

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + d + m + y);
    }
}
