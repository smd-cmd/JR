package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human Vasya = new Human("Вася", true, 40);
        Human Petya = new Human("Петя", true, 50);
        Human Masha = new Human("Маша", false, 40);
        Human Tanya = new Human("Таня", false, 30);

        Human Katya = new Human("Катя", false, 10, Vasya, Masha );
        Human Nina = new Human("Нина", false, 15, Petya, Tanya);
        Human Kolya = new Human("Коля", true, 6, Vasya, Masha);
        Human Lesha = new Human("Лёша", true, 8, Petya, Tanya);
        Human Andrew = new Human("Андрюша", true, 10, Vasya, Masha);

        System.out.println(Vasya);
        System.out.println(Petya);
        System.out.println(Masha);
        System.out.println(Tanya);
        System.out.println(Katya);
        System.out.println(Nina);
        System.out.println(Kolya);
        System.out.println(Lesha);
        System.out.println(Andrew);
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;

        }
        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}