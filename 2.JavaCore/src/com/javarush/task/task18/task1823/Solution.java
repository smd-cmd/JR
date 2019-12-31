package com.javarush.task.task18.task1823;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String fileName = rd.readLine();
            if (fileName.equals("exit")) break;
            ReadThread readThread = new ReadThread(fileName);
            readThread.start();
        }
        rd.close();

        /*for (Map.Entry<String, Integer> item : resultMap.entrySet()){
            System.out.printf("Key: %s  Value: %d \n", item.getKey(), item.getValue());
        }*/




    }

    public static class ReadThread extends Thread {
        //private BufferedInputStream inStream = null;
        private String fName;

        public ReadThread(String fileName) throws IOException {
            //implement constructor body

            this.fName = fileName;

        }
        // implement file reading here - реализуйте чтение из файла тут

        @Override
        public synchronized void run() {
            byte[] bf = new byte [255];
            int[] freqByte = new int[255];
            char b;
            int count;

            try {
                BufferedInputStream inStream = new BufferedInputStream(new FileInputStream(fName));
                while ((count = inStream.read()) != -1){
                    b = (char)count;
                    freqByte[b]++;
                }
                inStream.close();

            }catch (IOException e){
                System.out.println("Ошибка ввода/вывода нити");
            }


            int max = Integer.MIN_VALUE;
            int bt = 0;
            for (int j = 0; j < freqByte.length; j++) {
                if (max < freqByte[j]) {
                    max = freqByte[j];
                    bt = j;
                }
            }
            //System.out.println(max + " " + bt);
            resultMap.put(fName, bt);

        }
    }
}
