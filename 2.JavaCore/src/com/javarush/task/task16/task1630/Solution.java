package com.javarush.task.task16.task1630;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static{
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        try{

            firstFileName = rd.readLine();
            secondFileName = rd.readLine();
        }catch (IOException e){
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface{
        public String fileName;
        private ArrayList<String> lineAr = new ArrayList<String>();

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            String line = "";
            for (String L : lineAr) line = line + L + " ";
            return line;
        }

        @Override
        public void run() {
            String line;
            try{

                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8));

                while ((line = br.readLine()) != null ) lineAr.add(line);
                br.close();
            }catch (IOException e){
                System.out.println("Ошибка ввода/вывода");
            }
        }
    }
}
