package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        String s = "";
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
            s = rd.readLine();
        }catch (IOException e){
            System.out.println(e);
        }
        if (s.equals(thePlanet.SUN)) thePlanet = Sun.getInstance();
        else if (s.equals(thePlanet.MOON)) thePlanet = Moon.getInstance();
        else if (s.equals(thePlanet.EARTH)) thePlanet = Earth.getInstance();
        else thePlanet = null;
    }
}
