package com.javarush.task.task13.task1315;

/* 
Том, Джерри и Спайк
*/

public class Solution {
    public static void main(String[] args) {

    }
    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }
    public class Cat implements Movable, Edible, Eat {
        @Override
        public void move(){

        }

        @Override
        public void eat() {
        }

        @Override
        public void beEaten() {

        }
    }
    public class Dog implements Movable, Eat {
        @java.lang.Override
        public void eat() {

        }

        @java.lang.Override
        public void move() {

        }
    }

    public class Mouse implements Movable, Edible {
        @java.lang.Override
        public void move() {

        }

        @java.lang.Override
        public void beEaten() {

        }
    }
}