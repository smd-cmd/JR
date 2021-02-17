package com.javarush.task.task19.task1918;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

//import javax.swing.text.Document;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Знакомство с тегами
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String fName = rd.readLine();
        rd.close();

        rd = new BufferedReader(new FileReader(fName));
        StringBuilder htmlLine = new StringBuilder();
        while (rd.ready()){
            htmlLine.append(rd.readLine());
        }
        rd.close();
        /** решение через либу Jsoup, но не проходит валидатор
        String s = new String(htmlLine);
        Document document = Jsoup.parse(s,"", Parser.xmlParser());
        for (Element element : document.select(args[0])){

            System.out.println(element);
        }**/
        /** решение из каментов, тоже не проходит валидатор
        ArrayList<Integer> openTag = new ArrayList<>();
        ArrayList<Integer> closeTag = new ArrayList<>();

        openTag.add(-1);
        closeTag.add(-1);
        for (int i = 0; true; i++) {
            if (htmlLine.indexOf("</" + args[0], closeTag.get(i) + 1) == -1){
                break;
            }
            openTag.add(htmlLine.indexOf("<" + args[0], openTag.get(i) + 1));
            closeTag.add(htmlLine.indexOf("</" + args[0], closeTag.get(i)) + 2 + args[0].length());
        }
        for (int i = 1; i < openTag.size(); i++) {
            for (int j = i + 1; j < openTag.size(); j++) {
                if (openTag.get(j) < closeTag.get(i)) {
                    int temp = closeTag.get(j);
                    closeTag.set(j, closeTag.get(i));
                    closeTag.set(i, temp);
                } else {
                    break;
                }
            }
        }
        for (int k = 1; k < closeTag.size(); k++) {
            System.out.println(htmlLine.substring(openTag.get(k), closeTag.get(k)) + ">");
        }
         **/

        //решение javarush

        String fileContent = htmlLine.toString().replaceAll("\r\n", "");

        String openTag = "<" + args[0];
        String closingTag = "</" + args[0];
        int tagLength = args[0].length();
        int startTagIndex = 0;
        int endTagIndex = 0;

        ArrayList<String> tags = new ArrayList<>();

        while ((startTagIndex != -1) && (startTagIndex < fileContent.length())) {
            startTagIndex = fileContent.indexOf(openTag, startTagIndex);
            endTagIndex = fileContent.indexOf(closingTag, startTagIndex + tagLength);

            int indexInTag = startTagIndex + tagLength;
            if (endTagIndex != -1) {
                while (fileContent.substring(indexInTag, endTagIndex).contains(openTag)) {
                    indexInTag = endTagIndex + tagLength;
                    endTagIndex = fileContent.indexOf(closingTag, indexInTag);
                }
            }
            if (startTagIndex != -1 && endTagIndex != -1) {
                tags.add(fileContent.substring(startTagIndex, endTagIndex + tagLength + 3));
                startTagIndex += tagLength;
            }
        }

        for (String tag : tags) {
            System.out.println(tag);
        }

    }
}

