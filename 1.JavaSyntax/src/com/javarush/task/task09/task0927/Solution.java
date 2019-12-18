package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        String[] catArray = {"Мурка", "Барсик", "Вася", "Мурзик", "Пеструшка", "Рыжик", "Пушок", "Пушинка", "Уголёк", "Черныш"};
        Map<String, Cat> mp = new HashMap<String, Cat>();
        for (String s : catArray)
            mp.put(s, new Cat(s));
        return mp;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set <Cat> cats = new HashSet<>();
        Iterator<Map.Entry<String, Cat>> itr = map.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<String, Cat> pair = itr.next();
            Cat value = pair.getValue();
            cats.add(value);
        }
        return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
