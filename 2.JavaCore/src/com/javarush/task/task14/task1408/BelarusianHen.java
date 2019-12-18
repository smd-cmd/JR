package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {
    @java.lang.Override
    public int getCountOfEggsPerMonth() {
        return 33;
    }

    @java.lang.Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
