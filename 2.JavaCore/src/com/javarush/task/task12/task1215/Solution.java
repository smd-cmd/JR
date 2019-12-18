package com.javarush.task.task12.task1215;

/* 
Кошки не должны быть абстрактными!
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        private String name;
        //@java.lang.Override
        public String getName() {
            return name;
        }

        //@java.lang.Override
        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet {
        private String name;
        public String getName(){
            return name;
        }
        public Pet getChild() {
            return new Dog();
        }

    }

}
