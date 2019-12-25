package com.javarush.task.task18.task1812;

import java.io.*;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    private AmigoOutputStream original;

    public QuestionFileOutputStream(AmigoOutputStream outStream){
        this.original = outStream;
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        if (rd.readLine().equals("Д")) original.close();
    }
    @Override
    public void flush() throws IOException {
        original.flush();
    }
    @Override
    public void write(int b) throws IOException {
        original.write(b);
    }
    @Override
    public void write(byte[] b) throws IOException {
        original.write(b);
    }
    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        original.write(b, off, len);
    }
}

