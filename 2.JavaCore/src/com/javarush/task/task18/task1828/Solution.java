package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws IOException {

        ArrayList<String> productList = new ArrayList<>();

        byte idLength = 8;
        byte productNameLength = 30;
        byte priceLength = 8;
        byte quantityLength = 4;

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in)); //ввод имени файла
        String fName = rd.readLine();
        rd.close();

        if (args.length != 0) {
            String strId = args[1];
            System.out.println(strId);
            readFile(fName, productList);
            switch (args[0]){
                case "-u": {
                    String updLine = linePrepare(idLength, strId) + linePrepare(productNameLength, getProductName(args)) //получение итоговой строки для записи в файл
                            + linePrepare(priceLength, args[args.length - 2]) + linePrepare(quantityLength, args[args.length - 1]);
                    updateProduct(idLength, strId, updLine, productList);
                    writeFile(fName, productList);
                    break;
                }
                case "-d":{
                    deleteProduct(idLength, strId, productList);
                    writeFile(fName, productList);
                    break;
                }
            }
        }

    }

    public static void readFile (String fName, ArrayList<String> productList) throws IOException { //чтение из файла в эрейлист
        BufferedReader br = new BufferedReader(new FileReader(fName));
        String s;
        while ((s = br.readLine()) != null){
            productList.add(s);
        }
        br.close();
    }

    public static void updateProduct(byte idLength, String strId, String updLine, ArrayList<String> productList){ //обновление строки массива по id
        int index = 0;
        for (String s : productList){
            if (s.substring(0, idLength-1).trim().equals(strId)) break;
            index++;
        }
        if (index == productList.size()) {
            System.out.println("Id продукта не найден");

        }else productList.set(index, updLine);
    }

    public static void  deleteProduct(byte idLength, String strId, ArrayList<String> productList){ //удаление строки массива по id
        int i = 0;
        int index = 0;
        for (String s : productList){
            //System.out.println(index);
            //System.out.println(s);
            String l = s.substring(0, idLength-1).trim();
            //System.out.println(l + " " + strId);
            if (strId.equals(l)) break;
            index++;
        }
        if (index == productList.size()) {
            System.out.println("Id продукта не найден");

        }else productList.remove(index);
    }

    public static void writeFile(String fName, ArrayList<String> productList) throws IOException { //запись в файл, после каждой строки возврат каретки/перевод строки
        BufferedWriter bw = new BufferedWriter(new FileWriter(fName));
        for (String s : productList){
            bw.write(s);
            bw.write("\r\n");

        }
        bw.close();
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

    public static String getProductName(String[] args){ //получение имени продукта из параметра запуска, если он состоит из нескольких слов
        StringBuilder s1 = new StringBuilder();
        for (int i = 2; i < args.length - 2; i++) {
            s1.append(args[i]).append(" ");
        }

        return s1.toString();
    }

}
