package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(rd.readLine());
        int b = Integer.parseInt(rd.readLine());
        int c = Integer.parseInt(rd.readLine());

        if ((a > b & a < c)|(a < b & a > c)) System.out.println(a);
        else if ((b > a & b < c)|(b < a & b > c)) System.out.println(b);
        else if ((c > a & c < b)|(c < a & c > b)) System.out.println(c);
        else if (a == b) System.out.println(a);
        else if (b == c) System.out.println(b);
        else if (a == c) System.out.println(c);
        else if (a == b & b == c) System.out.println(a);
    }
}
