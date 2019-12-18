package com.javarush.task.task15.task1529;

public class Plane implements CanFly {
    public int number;

    public void fly(){
        System.out.println("Самолет летит");
    }
    public Plane (int number){
        this.number = number;
    }
}
