package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String fName1 = rd.readLine();
        String fName2 = rd.readLine();
        rd.close();
        ArrayList<String> f1Lines = new ArrayList<>();
        ArrayList<String> f2Lines = new ArrayList<>();


        BufferedReader rd1 = new BufferedReader(new FileReader(fName1));
        BufferedReader rd2 = new BufferedReader(new FileReader(fName2));
        String ln = "";
        //String ln2 = "";
        //LineItem lineItem = new LineItem();

        while ((ln = rd1.readLine()) != null){
            f1Lines.add(ln);
        }
        rd1.close();
        //for (String s : f1Lines) System.out.println(s);
        //System.out.println("-------------------------------------");
        while ((ln = rd2.readLine()) != null){
            f2Lines.add(ln);
        }
        rd2.close();
        //for (String s : f2Lines) System.out.println(s);

        int i = 0;

        while(true){
            if (f1Lines.get(i).equals(f2Lines.get(i))){
                lines.add(new LineItem(Type.SAME, f1Lines.get(i)));
                //System.out.println(Type.SAME + " " + f1Lines.get(i));
                f1Lines.remove(i);
                f2Lines.remove(i);
            }else if (f1Lines.get(i+1).equals(f2Lines.get(i))){
                lines.add(new LineItem(Type.REMOVED, f1Lines.get(i)));
                //System.out.println(Type.REMOVED + " " + f1Lines.get(i));
                f1Lines.remove(i);
            }else{
                lines.add(new LineItem(Type.ADDED, f2Lines.get(i)));
                //System.out.println(Type.ADDED + " " + f2Lines.get(i));
                f2Lines.remove(i);
            }
            if ((f1Lines.size() == 0) | (f2Lines.size() == 0)) break;
        }

        if (f1Lines.size() > 0) lines.add(new LineItem(Type.REMOVED, f1Lines.get(i)));
        if (f2Lines.size() > 0) lines.add(new LineItem(Type.ADDED, f2Lines.get(i)));

    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
