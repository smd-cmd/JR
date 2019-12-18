package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int power1 = 0;
        int power2 = 0;

        if (this.age > anotherCat.age) power1++;
        else if (this.age < anotherCat.age) power2++;
        if (this.weight > anotherCat.weight) power1++;
        else if (this.weight < anotherCat.weight) power2++;
        if (this.strength > anotherCat.strength) power1++;
        else if (this.strength < anotherCat.strength) power2++;

        if (power1 > power2) return true;
        else return false;
    }

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println(cat1.fight(cat2));

    }
}
