package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String fileForAll = rd.readLine();
        String fileForRem = rd.readLine();
        rd.close();

        String line;
        rd = new BufferedReader(new InputStreamReader(new FileInputStream(fileForAll), StandardCharsets.UTF_8));
        while ((line = rd.readLine()) != null ) allLines.add(line);
        rd.close();

        rd = new BufferedReader(new InputStreamReader(new FileInputStream(fileForRem), StandardCharsets.UTF_8));
        while ((line = rd.readLine()) != null ) forRemoveLines.add(line);
        rd.close();

        Solution solution = new Solution();
        solution.joinData();

        //joinData();

        //for (String s : allLines) System.out.println(s);
    }

    public void joinData() throws CorruptedDataException {

        if (allLines.containsAll(forRemoveLines)) allLines.removeAll(forRemoveLines);
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
