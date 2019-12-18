package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {
    @java.lang.Override
    public int getCountOfEggsPerMonth() {
        return 30;
    }

    @java.lang.Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
