package com.javarush.task.task16.task1632;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new Thread_1());
        threads.add(new Thread_2());
        threads.add(new Thread_3());
        threads.add(new Thread_4());
        threads.add(new Thread_5());
    }

    public static void main(String[] args) {
        for (Thread t : threads){
            t.start();
        }
    }

    public static class Thread_1 extends Thread{
        @Override
        public void run() {
            while(true){

            }
        }
    }

    public static class Thread_2 extends Thread{
        @Override
        public void run() {
            //boolean isCurrentThreadInterrupted = Thread.currentThread().isInterrupted();
            try{
                while(true){
                    Thread.sleep(0);
                }
            }catch (InterruptedException e){
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Thread_3 extends Thread{
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            }catch (InterruptedException e){

            }
        }
    }

    public static class Thread_4 extends Thread implements Message{
        private boolean isCancel = false;

        @Override
        public void showWarning() {
            if (this.isAlive()) isCancel = true;
        }

        @Override
        public void run() {
            while (!isCancel){

            }
        }
    }

    public static class Thread_5 extends Thread{
        @Override
        public void run() {
            BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
            String s = "";
            int sum = 0;
            try{
                while (!(s = rd.readLine()).equals("N")){

                    sum = sum + Integer.parseInt(s);

                }
                System.out.println(sum);
            }catch (IOException e){
                System.out.println("Ошибка ввода/ввыода");
            }
        }
    }


}