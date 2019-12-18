package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat("Vaska", 4, 4,5);
        Cat cat2 = new Cat("Barsik", 6, 5, 6);
        Cat cat3 = new Cat("Mashka", 6, 5, 5);

        if (cat1.fight(cat2)) System.out.println(cat1.name + " победил");
        else System.out.println(cat2.name + " победил");
        if (cat2.fight(cat3)) System.out.println(cat2.name + " победил");
        else System.out.println(cat3.name + " победил");
        if (cat1.fight(cat3)) System.out.println(cat1.name + " победил");
        else System.out.println(cat3.name + " победил");
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
            int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
            int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

            int score = ageAdvantage + weightAdvantage + strengthAdvantage;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
