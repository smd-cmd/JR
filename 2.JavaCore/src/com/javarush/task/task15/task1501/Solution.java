package com.javarush.task.task15.task1501;

/* 
ООП - Расставить интерфейсы
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Movable, Sellable, Discountable {

        @java.lang.Override
        public boolean isMovable() {
            return false;
        }

        @java.lang.Override
        public Object getAllowedAction() {
            return null;
        }

        @java.lang.Override
        public Object getAllowedAction(String name) {
            return null;
        }
    }
}
