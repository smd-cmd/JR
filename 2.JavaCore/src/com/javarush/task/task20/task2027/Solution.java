package com.javarush.task.task20.task2027;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Кроссворд
*/

public class Solution {
    // массив смещений индексов относительно произвольного символа матрицы (без граничных условий)
    public int offset[][] = {
            {-1, -1},
            { 0, -1},
            { 1, -1},
            { 1,  0},
            { 1,  1},
            { 0,  1},
            {-1,  1},
            {-1,  0}
    };
    // получение элемента массива смещения для symbolArround - позиция, с которой начинать обход в случае совпадения
    // найденного второго символа из слова
    public int getOffset(int dx, int dy){
        if (dx == -1 & dy == -1) return 0;
        if (dx == 0 & dy == -1) return 1;
        if (dx == 1 & dy == -1) return 2;
        if (dx == 1 & dy == 0) return 3;
        if (dx == 1 & dy == 1) return 4;
        if (dx == 0 & dy == 1) return 5;
        if (dx == -1 & dy == 1) return 6;
        if (dx == -1 & dy == 0) return 7;
        return -1;
    }

    // координаты первого заданного после posX posY символа в матрице. в [0] - номер столбца x, [1]  - номер строки y
    public int[] symbolPos(int crossword[][], int symb, int posX, int posY){
        int lenX = crossword[0].length;
        int lenY = crossword.length;
        //System.out.println(lenX + " " + lenY);
        for (int y = posY; y < lenY; y++){
            for (int x = posX; x < lenX; x ++){
                //System.out.println(x + " x " + y + " y ");
                if (symb == crossword[y][x]) return new int[]{x, y};
            }
            posX = 0;
        }
        return new int[] {-1};
    }
    // обход соседних к заданному символу (его координаты в coord) ячеек и возврат координат следующего символа
    // crossword - матрица символов, nextSymb - след.символ, y - смещение координат offset, с которой начинается обход тек. символа для поиска следующего
    public int[] symbolAround(int[] coord, int[][] crossword, int nextSymb, int y){
        //int y = 0;
        int lenX = crossword[0].length;
        int lenY = crossword.length;
        int posx, posy;
        do {
             posx = coord[0] + offset[y][0];
             posy = coord[1] + offset[y][1];
            //System.out.println(posx + " " + posy);
            // контроль граничных значений, когда символ на границе диапазона, пропускаем невалидные координаты
            if (posx < 0 | posy < 0 | posx >= lenX | posy >= lenY){
                y++;
                continue;
            }else{
                if (crossword[posy][posx] == nextSymb){
                    //System.out.println(posx + " " + posy + " " + (char)crossword[posy][posx]);
                    return new int[] {posx, posy};
                }
                y++;
            }
        }while(y < 8);
        return new int[]{-1};
    }
    // разложение строки на массив int
    public int[] getInt(String source){
        char[] ch = source.toCharArray();
        int[] out = new int[source.length()];
        int i =0;
        for (char c : ch){
            out[i] = (int) c;
            i++;
        }
        return out;
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        List<Word> w = new ArrayList<>();
        Solution sol = new Solution();
        for (String source : words){
            Word word = new Word(source);

            int[] symbols = sol.getInt(source);
            int[] coord;
            int [] coordNext = new int[2];
            int pX = 0, pY = 0;
            int baseX = 0, baseY = 0;
            int i = 0;

            do{
                int dx = -1, dy = -1;
                //1. получение позиции первой буквы слова
                coord = sol.symbolPos(crossword, symbols[0], pX, pY);

                // если слово из одной буквы
                if (symbols.length == 1) break;
                // контроль отсутствия заданного символа в исходной матрице
                if (coord[0] == -1){
                    System.out.println("нет такой буквы " + (char) symbols[0]);
                    break;
                }
                word.setStartPoint(coord[0], coord[1]);
                //System.out.println(coord[0] + " " + coord[1] + " " + (char)symbols[0]);
                // координаты первой буквы
                baseX = coord[0];
                baseY = coord[1];
                //System.out.println(baseX + " -- " + baseY);
                i = 1;
                // в этом цикле идет поиск остальных букв слова и контроль их расположения в линию
                // если не в линию, переход во внешний цикл, ищем первую букву слова дальше и т.д.
                do {
                    //System.out.println(i + "  dx: " + dx + " dy: " + dy );
                    //2. поиск следующей буквы вокруг найденной в п.1. начинается с относительной позиции
                    // соответствующей приращению координат для следующего символа в слове
                    coordNext = sol.symbolAround(coord, crossword, symbols[i], sol.getOffset(dx, dy) );
                    //System.out.println(coordNext[0] + " coordNext");

                    if (coordNext[0] != -1){
                        dx = coordNext[0] - coord[0];
                        dy = coordNext[1] - coord[1];
                        coord[0] = coordNext[0];
                        coord[1] = coordNext[1];
                    } else{
                        // контроль граничных значений, если символ - последний в текущей строке, начинаем поиск со след. строки
                        //System.out.println("base X Y " + baseX + " " + baseY);
                        if (baseX == crossword[0].length - 1 & baseY < crossword.length){
                            pX = 0;
                            pY = baseY + 1;
                            break;
                        }

                        // контроль граничных значений, если символ - последний в исходной матрице
                        if (baseY == crossword.length - 1 & baseX == crossword[0].length - 1) break;
                        pX = baseX + 1;
                        pY = baseY;
                        break;
                    }

                    // контроль по приращению индексов, что все символы находятся на одной линии
                    if ((baseX - coordNext[0]) % i == 0 & (baseY - coordNext[1]) % i == 0 ) i++;
                    else if (i  == symbols.length - 1) break;
                    else continue;

                    //System.out.println(Arrays.toString(coordNext));
                }while(i < symbols.length);
                //System.out.println(pX + " pX " + pY + " pY ");

            }while (i < symbols.length );
            word.setEndPoint(coordNext[0], coordNext[1]);
            w.add(word);
            //System.out.println("*******");
        }

        return w;
    }
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        System.out.println(detectAllWords(crossword, "lngro", "jjeeop"));
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */


}

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
