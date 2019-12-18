package com.javarush.task.task15.task1522;

// Синглтон с ленивой реализацией

public class Sun implements Planet {
    private static Sun instance;    // #1 добавить приватное статическое поле, содержащее одиночный объект
    private Sun(){}      // #2 закрыть доступ к объекту из другого класса
    public static Sun getInstance(){ // #3
        if(instance == null){		//если объект еще не создан
            instance = new Sun();	//создать новый объект
        }
        return instance;		// вернуть ранее созданный объект
    }
}