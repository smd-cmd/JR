package com.javarush.task.task13.task1319;

/*import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;*/
import java.io.*;
import java.io.IOException;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String name = rd.readLine();
        File file = new File(name);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        try {

            String line = "";

             do {
                 line = rd.readLine();
                bufferedWriter.write(line + "\n");
            }while (!(line.equals("exit")));
            //bufferedWriter.write(line + "/n");
        }catch ( IOException e ){

            e.printStackTrace();

        } finally {

            rd.close(); // закрываем поток
            bufferedWriter.close();


        }



    }
}
