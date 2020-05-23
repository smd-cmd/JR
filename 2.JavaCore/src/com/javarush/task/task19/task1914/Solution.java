package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consStream = System.out;
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outStream);
        System.setOut(stream);

        testString.printSomething();

        String result = outStream.toString();
        System.setOut(consStream);

        Pattern numPattern = Pattern.compile("[0-9]+");
        Pattern opPattern = Pattern.compile("[-+*]");
        Matcher numMatcher = null;
        Matcher opMatcher = null;

        int[] nums = new int[2];
        String operand = "";
        byte count = 0;
        for (String s : result.split(" ")){
            //System.out.println(s);
            numMatcher = numPattern.matcher(s);
            opMatcher = opPattern.matcher(s);
            if (numMatcher.matches()) {
                nums[count] = Integer.parseInt(s);
                count++;
            }
            if (opMatcher.matches()) operand = s;
        }
        int out = 0;
        if (operand.equals("+")) out = nums[0] + nums[1];
        if (operand.equals("-")) out = nums[0] - nums[1];
        if (operand.equals("*")) out = nums[0] * nums[1];
        System.out.println(result + out);

    }

    public static class TestString {
        public void printSomething() {
            System.out.print("3 + 6 = ");
        }
    }
}

