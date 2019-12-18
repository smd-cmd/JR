package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    @java.lang.Override
    public int getCountOfEggsPerMonth() {
        return 29;
    }

    @java.lang.Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
