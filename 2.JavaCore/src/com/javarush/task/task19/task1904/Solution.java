package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner){
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String persRegExp = "(.+) (.+) (.+) (\\d+) (\\d+) (\\d+)";
            String dateFormatter = "dd MM yyyy";
            if (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String firstName  = line.replaceFirst(persRegExp, "$2");
                String middleName = line.replaceFirst(persRegExp, "$3");
                String lastName   = line.replaceFirst(persRegExp, "$1");
                SimpleDateFormat date = new SimpleDateFormat(dateFormatter);
                Date birthDate = null;
                try {
                    birthDate = date.parse(line.replaceFirst(persRegExp, "$4 $5 $6"));
                }
                catch (ParseException e) {e.printStackTrace();}

                return new Person(firstName, middleName, lastName, birthDate);
            }

            return null;
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}
