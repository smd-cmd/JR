package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fName = reader.readLine();
        reader.close();

        FileOutputStream fOutStream = new FileOutputStream(fName);

        PrintStream consStream = System.out;
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outStream);
        System.setOut(stream);

        testString.printSomething();

        String result = outStream.toString();
        byte[] char2Rec = result.getBytes();
        fOutStream.write(char2Rec);

        System.setOut(consStream);
        fOutStream.close();
        System.out.println(result);




    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

