package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {
    @java.lang.Override
    public int getCountOfEggsPerMonth() {
        return 31;
    }

    @java.lang.Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
