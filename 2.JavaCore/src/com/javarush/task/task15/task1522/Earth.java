package com.javarush.task.task15.task1522;

public class Earth implements Planet {
    private static Earth instance;    // #1 добавить приватное статическое поле, содержащее одиночный объект
    private Earth(){}      // #2 закрыть доступ к объекту из другого класса
    public static Earth getInstance(){ // #3
        if(instance == null){		//если объект еще не создан
            instance = new Earth();	//создать новый объект
        }
        return instance;		// вернуть ранее созданный объект
    }
}
