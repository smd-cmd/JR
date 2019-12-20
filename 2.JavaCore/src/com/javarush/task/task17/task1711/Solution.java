package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Person person = null;
        int numArg = args.length;
        //System.out.println(numArg);

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 2; i <= numArg - 2; i += 3) {
                        if (args[i].equals("м")) person = Person.createMale(args[i - 1], df.parse(args[i + 1]));
                        else if (args[i].equals("ж")) person = Person.createFemale(args[i - 1], df.parse(args[i + 1]));
                        allPeople.add(person);
                        System.out.println(allPeople.indexOf(person));
                    }
                    break;
                }
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i <= numArg - 4; i += 4) {
                        int index = Integer.parseInt(args[i]);
                        person = allPeople.get(index);
                        person.setName(args[i + 1]);
                        person.setBirthDate(df.parse(args[i + 3]));
                        if (args[i + 2].equals("м")) person.setSex(Sex.MALE);
                        else if (args[i + 2].equals("ж")) person.setSex(Sex.FEMALE);
                        allPeople.set(index, person);
                    }
                    break;
                }
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i <= numArg - 1; i++) {
                        int index = Integer.parseInt(args[i]);
                        person = allPeople.get(index);
                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDate(null);
                        allPeople.set(index, person);
                    }
                    break;
                }
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i <= numArg - 1; i++) {
                        int index = Integer.parseInt(args[i]);
                        String sx = "";
                        person = allPeople.get(index);
                        SimpleDateFormat dftoPrint = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                        if (person.getSex() == Sex.MALE) sx = "м";
                        else if (person.getSex() == Sex.FEMALE) sx = "ж";
                        System.out.println(person.getName() + " " + sx + " " + dftoPrint.format(person.getBirthDate()));
                    }
                    break;
                }
        }
    }
}
