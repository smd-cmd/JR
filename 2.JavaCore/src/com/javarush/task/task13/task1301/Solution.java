package com.javarush.task.task13.task1301;

/* 
Пиво
*/
public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Drinker {
        void askForMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcoholic extends Drinker {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class BeerLover implements Alcoholic {

        //@Overide;
        public void sleepOnTheFloor(){
            System.out.println("Хррррр...");
        }
        //@Override;
        public void askForMore(String message){
            System.out.println(message);
        }
        //@Override
        public void sayThankYou() {
            System.out.println("Спсиибо...ик");
        }
        //@Override;
        public boolean isReadyToGoHome(){
            System.out.println("На посошок!");
            return READY_TO_GO_HOME;
        }
    }
}