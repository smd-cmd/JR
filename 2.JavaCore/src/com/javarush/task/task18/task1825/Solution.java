package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, String> fNameMap = new TreeMap<>();
        String fName;
        String SummaFName = "";
        while (!(fName = rd.readLine()).equals("end")){
            int key = Integer.parseInt(fName.substring(fName.lastIndexOf("t") + 1));
            //System.out.println(key);
            fNameMap.put(key, fName);
            SummaFName = fName.substring(0, fName.lastIndexOf("."));
        }
        rd.close();
        //System.out.println(SummaFName);


        BufferedOutputStream outStream = new BufferedOutputStream(new FileOutputStream(SummaFName, true));
        //boolean isFirst = true;
        for (Map.Entry<Integer, String> p : fNameMap.entrySet()){

            BufferedInputStream inStream = new BufferedInputStream(new FileInputStream(p.getValue()));
            int count;
            while((count = inStream.read())!= -1){
                outStream.write(count);
            }
            inStream.close();
        }
        outStream.close();

    }
}
