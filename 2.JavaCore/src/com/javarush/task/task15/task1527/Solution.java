package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        BufferedReader rd = null;
        String url = "";
        try{
            rd = new BufferedReader(new InputStreamReader(System.in));
            url = rd.readLine();
        }catch (IOException e) {
            System.out.println("Ошибка ввода/вывода");
        }
        int par_index;
        String suburl = ""; //подстрока в которую записываются часть строки, содерж. параметры
        //ArrayList<Double> double_values = new ArrayList<Double>();
        ArrayList<String> string_values = new ArrayList<String>();

        if ((par_index = url.indexOf("?"))!= -1) {              //если урл содержит параметры (есть знак "?")
            suburl = url.substring(par_index + 1);
            for (String param : suburl.split("&")){        //в цикле нарезаем на подстроки по знаку "&" (одна строка - один параметр)

                          //отрезаем с параметрами подстроку
                int equ_index;
                if ((equ_index = param.indexOf("=")) != -1){        // если в параметре есть знак "="
                    System.out.print(param.substring(0, equ_index)); //выводим этот параметр (избавляясь от знака "=")
                } else System.out.print(param);                        //а если знака "=" нет - просто выводим параметр
                System.out.print(" ");

                int obj_index;
                String val = "";
                if ((obj_index = param.indexOf("obj")) != -1){            //если параметр содержит "obj"
                    val = param.substring(param.indexOf("=") + 1);
                    string_values.add(val);                             // записываем его значения в массив строк
                }
            }
            System.out.println();
            for (String s : string_values){     //если строка парсится в double без ошибок то выводим одним alertом
                try{
                    double valD = Double.parseDouble(s);
                    alert(valD);
                }catch(NumberFormatException e){  //а если есть исключение, то выводим как строку
                    alert(s);
                }
            }
        }
        //if (suburl.equals("")) System.out.println("В веденном url нет параметров");
        /*for (String param : suburl.split("&")) {
            System.out.println(param);
        }*/

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
