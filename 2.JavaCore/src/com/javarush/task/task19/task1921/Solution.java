package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader rd = new BufferedReader(new FileReader(args[0]));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d M yyyy");
        //Map<String, Double> table = new HashMap<>();
        while (rd.ready()){
            String s = rd.readLine();
            PEOPLE.add(new Person(s.replaceAll("\\d+", "").trim(),
                    simpleDateFormat.parse(s.replaceAll("\\D+\\s", ""))));

        }
        rd.close();
        for(Person p : PEOPLE){
            System.out.println(p.getName() + " " + p.getBirthDate());
        }
    }
}
