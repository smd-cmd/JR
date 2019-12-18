package com.javarush.task.task12.task1218;

/* 
Есть, летать и двигаться
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanMove, CanEat{
        //@java.lang.Override
        public void move() {
            System.out.println("Собака бежит");
        }

        //@java.lang.Override
        public void eat() {
            System.out.println("Собака ест");

        }
    }

    public class Duck implements CanMove, CanFly, CanEat {
        public void move() {
            System.out.println("Утка двигается");
        }
        public void fly() {
            System.out.println("Утка летит");
        }
        public void eat() {
            System.out.println("Утка ест");

        }
    }

    public class Car implements CanMove {
        public void move(){
            System.out.println("Автомобиль едет");
        }
    }

    public class Airplane implements CanMove, CanFly {
        public void move() {
            System.out.println("Самолет двигается");
        }
        public void fly() {
            System.out.println("Самолет летит");
        }

    }
}
