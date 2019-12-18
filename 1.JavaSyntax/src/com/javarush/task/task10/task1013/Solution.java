package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private byte age;
        private boolean sex;
        private short weight;
        private float length;
        private byte children;

        public Human(String name){
            this.name = name;
            this.age = 0;
            this.sex = true;
            this.weight = 5;
            this.length = 0.5f;
            this.children = 0;
        }
        public Human (String name, byte age ){
            this.name = name;
            this.age = age;
            this.sex = true;
            this.weight = 50;
            this.length = 1.6f;
            this.children = 0;
        }
        public Human (String name, byte age, byte children ){
            this.name = name;
            this.age = age;
            this.sex = true;
            this.weight = 70;
            this.length = 1.8f;
            this.children = children;
        }
        public Human (String name, byte age, boolean sex, byte children ){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = 70;
            this.length = 1.8f;
            this.children = children;
        }
        public Human (boolean sex){
            this.name = "unknown";
            this.age = 0;
            this.sex = sex;
            this.weight = 0;
            this.length = 0f;
            this.children = 0;
        }
        public Human (boolean sex, short weight ){
            this.name = "unknown";
            this.age = 0;
            this.sex = sex;
            this.weight = weight;
            this.length = 1.8f;
            this.children = 0;
        }
        public Human (boolean sex, short weight, float length ){
            this.name = "unknown";
            this.age = 0;
            this.sex = sex;
            this.weight = weight;
            this.length = length;
            this.children = 0;
        }
        public Human (byte age, boolean sex, short weight, float length ){
            this.name = "unknown";
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.length = length;
            this.children = 0;
        }
        public Human (String name, byte age, boolean sex, short weight, float length ){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.length = length;
            this.children = 0;
        }
        public Human (String name, byte age, boolean sex, short weight, float length, byte children ){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.length = length;
            this.children = children;
        }
    }
}
