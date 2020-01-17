package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        byte idLength = 8;
        byte productNameLength = 30;
        byte priceLength = 8;
        byte quantityLength = 4;

        int id;


        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in)); //ввод имени файла
        String fName = rd.readLine();
        rd.close();

        if ((args.length != 0) && (args[0].equals("-c"))){
            rd = new BufferedReader(new FileReader(fName));
            String line = "";
            String idLine = "";
            int maxId = Integer.MIN_VALUE;

            while ((line = rd.readLine()) != null){ //построчное чтение из файла с поиском макс id
                idLine = line.substring(0, idLength).trim();
                id = Integer.parseInt(idLine);
                maxId = Integer.max(id, maxId);
            }
            id = maxId + 1;
            rd.close();

            String outLine = linePrepare(idLength, String.valueOf(id)) + linePrepare(productNameLength, getProductName(args)) //получение итоговой строки для записи в файл
                    + linePrepare(priceLength, args[args.length - 2]) + linePrepare(quantityLength, args[args.length - 1]);

            BufferedWriter rt = new BufferedWriter(new FileWriter(fName, true));
            rt.write("\r\n" + outLine);
            rt.close();
        }


    }

    public static String getProductName(String[] args){ //получение имени продукта из параметра запуска, если он состоит из нескольких слов
        StringBuilder s1 = new StringBuilder();
        for (int i = 1; i < args.length - 2; i++) {
            s1.append(args[i]).append(" ");
        }

        return s1.toString();
    }

    public static String linePrepare(int length, String args){ //подготовка строки для записи в файл (обрезка/дополнение пробелами до нужной длины)
        String s = args;
        if (args.length() < length) { //дополнение пробелами
            for (int i = 0; i < length - args.length(); i++) s = s + " ";
        }
        if (args.length() > length){ //обрезка
            s = args.substring(0, length);
        }
        return s;
    }
}
