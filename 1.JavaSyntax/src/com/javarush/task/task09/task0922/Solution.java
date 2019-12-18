package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String s = rd.readLine();
        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //try{
            dt = sdf.parse(s);
        //}catch (ParseException e){
            //System.out.println(e);
        //}
        int month = Integer.parseInt(String.format("%tm", dt));
        String sout = "";

        switch (month){
            case 1: sout = "JAN " + String.format("%td", dt) + ", " + String.format("%tY", dt);
                break;
            case 2: sout = "FEB " + String.format("%td", dt) + ", " + String.format("%tY", dt);
                break;
            case 3: sout = "MAR " + String.format("%td", dt) + ", " + String.format("%tY", dt);
                break;
            case 4: sout = "APR " + String.format("%td", dt) + ", " + String.format("%tY", dt);
                break;
            case 5: sout = "MAY " + String.format("%td", dt) + ", " + String.format("%tY", dt);
                break;
            case 6: sout = "JUN " + String.format("%td", dt) + ", " + String.format("%tY", dt);
                break;
            case 7: sout = "JUL " + String.format("%td", dt) + ", " + String.format("%tY", dt);
                break;
            case 8: sout = "AUG " + String.format("%td", dt) + ", " + String.format("%tY", dt);
                break;
            case 9: sout = "SEP " + String.format("%td", dt) + ", " + String.format("%tY", dt);
                break;
            case 10: sout = "OCT " + String.format("%td", dt) + ", " + String.format("%tY", dt);
                break;
            case 11: sout = "NOV " + String.format("%td", dt) + ", " + String.format("%tY", dt);
                break;
            case 12: sout = "DEC " + String.format("%td", dt) + ", " + String.format("%tY", dt);
                break;


        }


        System.out.println(sout);
    }
}
