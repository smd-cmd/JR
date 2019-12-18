package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> gen2_lst = new ArrayList<>();
        //ArrayList<Human> gen2wom_lst = new ArrayList<>();
        ArrayList<Human> gen1man_lst = new ArrayList<>();
        ArrayList<Human> gen1wom_lst = new ArrayList<>();

        Human sonVasya = new Human("Vasya", true, 10);
        gen2_lst.add(sonVasya);
        Human sonKolya = new Human("Kolya", true, 5);
        gen2_lst.add(sonKolya);
        Human dotMasha = new Human("Masha", false, 8);
        gen2_lst.add(dotMasha);
        Human mother = new Human("Olga", false, 35, gen2_lst);
        gen1wom_lst.add(mother);
        Human father = new Human("Oleg", true, 40, gen2_lst);
        gen1man_lst.add(father);

        Human grandfather1 = new Human("Ivan", true, 75, gen1wom_lst);
        Human grandmather1 = new Human("Natalia", true, 70, gen1wom_lst);

        Human grandfather2 = new Human("Dmitri", true, 73, gen1man_lst);
        Human grandmather2 = new Human("Galina", true, 71, gen1man_lst);

        System.out.println(grandfather1);
        System.out.println(grandmather1);
        System.out.println(grandfather2);
        System.out.println(grandmather2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(sonKolya);
        System.out.println(sonVasya);
        System.out.println(dotMasha);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        Human (String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<>();
        }

        Human (String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }



        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }//else text += ", дети: нет";
            return text;
        }
    }
}
