package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/

public class Solution implements Externalizable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("temp.dat"));
        ObjectInputStream inStream = new ObjectInputStream(new FileInputStream("temp.data"));

        Solution savedObject = new Solution(5);
        savedObject.writeExternal(outStream);
        System.out.println(new Solution(4));
        Solution loadedObject = new Solution(4);
        loadedObject.readExternal(inStream);
        if (savedObject.string.equals(loadedObject.string)) System.out.println("Поля равны");

    }

    private final transient String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(string);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        string = (String) in.readObject();
    }
}
