package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.util.Scanner;
    import java.io.FileInputStream;
    import java.io.BufferedInputStream;
    //import java.io.FileInputStream;
    import java.io.InputStream;
    import java.io.IOException;

    /*
    Чтение файла
    */

    public class Solution {
        public static void main(String[] args) throws IOException {
            // напишите тут ваш код

            InputStream inputStream = null;
            BufferedInputStream buffer = null;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String name = reader.readLine();


            try {

                inputStream = new FileInputStream(name);
                buffer = new BufferedInputStream(inputStream);

                while (buffer.available() > 0) {

                    char c = (char) buffer.read();

                    System.out.print(c);

                }
            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                inputStream.close();
                buffer.close();
                reader.close();
            }

        }
    }