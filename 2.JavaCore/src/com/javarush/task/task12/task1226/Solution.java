package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public static void main(String[] args) {

    }

    public interface CanFly{
        public void fly();
    }
    public interface CanClimb{
        public void climb();
    }
    public interface CanRun{
        public void run();
    }

    public class Cat implements CanRun, CanClimb {
        public void run(){
            System.out.println("Кот Бегает");
        }
        public void climb(){
            System.out.println("Кот Лазит по деревьям");
        }
    }

    public class Dog implements CanRun {
        public void run(){
            System.out.println("Собакен Бегает");
        }
    }

    public class Tiger extends Cat {
    }

    public class Duck implements CanRun, CanFly {
        public void run(){
            System.out.println("Утка Бегает");
        }
        public void fly(){
            System.out.println("Утка Летает");
        }
    }
}
