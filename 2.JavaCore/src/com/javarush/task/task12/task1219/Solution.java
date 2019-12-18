package com.javarush.task.task12.task1219;

/* 
Создаем человека
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public class Human implements CanRun, CanSwim {
        @java.lang.Override
        public void run() {
            System.out.println("Человек плывет");
        }

        @java.lang.Override
        public void swim() {
            System.out.println("Человек плывет");
        }
    }

    public class Duck implements CanFly, CanRun, CanSwim {
        @java.lang.Override
        public void fly() {
            System.out.println("Утка плывет");
        }

        @java.lang.Override
        public void run() {
            System.out.println("Утка бежит");
        }

        @java.lang.Override
        public void swim() {
            System.out.printf("Утка плывет");
        }
    }

    public class Penguin implements CanSwim, CanRun {
        @java.lang.Override
        public void swim() {
            System.out.println("Пингвин плывет");
        }

        @java.lang.Override
        public void run() {
            System.out.println("Пингвин бежит");
        }
    }

    public class Airplane implements CanFly, CanRun {
        @java.lang.Override
        public void run() {
            System.out.println("Самолет двигается");
        }

        @java.lang.Override
        public void fly() {
            System.out.println("Самолет летит");
        }
    }
}
