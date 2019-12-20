package com.javarush.task.task17.task1710;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        /*String oper = args[0];
        String name = args[1];
        String sex = args[2];
        String date = args[3];*/
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Person person = null;

        if (args[0].equals("-c")){
            if (args[2].equals("м")) person = Person.createMale(args[1], df.parse(args[3]));
            else if (args[2].equals("ж")) person = Person.createFemale(args[1], df.parse(args[3]));
            allPeople.add(person);
            System.out.println(allPeople.indexOf(person));
        }
        if (args[0].equals("-u")){
            int index = Integer.parseInt(args[1]);
            person = allPeople.get(index);
            person.setName(args[2]);
            person.setBirthDate(df.parse(args[4]));
            if (args[3].equals("м")) person.setSex(Sex.MALE);
            else if (args[3].equals("ж")) person.setSex(Sex.FEMALE);
            allPeople.set(index, person);
        }
        if (args[0].equals("-d")) {
            int index = Integer.parseInt(args[1]);
            person = allPeople.get(index);
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
            allPeople.set(index, person);
        }
        if (args[0].equals("-i")) {
            int index = Integer.parseInt(args[1]);
            String sx = "";
            person = allPeople.get(index);
            SimpleDateFormat dftoPrint = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            if (person.getSex() == Sex.MALE) sx = "м";
            else if (person.getSex() == Sex.FEMALE) sx = "ж";
            System.out.println(person.getName() + " " + sx + " " + dftoPrint.format(person.getBirthDate()));

        }
    }
}
