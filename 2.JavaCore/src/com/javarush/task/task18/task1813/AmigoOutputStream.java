package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";

    public static void main(String[] args) throws FileNotFoundException, IOException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

    private FileOutputStream original;

   public AmigoOutputStream (FileOutputStream  fOutStream) throws IOException{
        super(fileName);
        this.original = fOutStream;

    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        original.write(b, off, len);
    }

    @Override
    public void write(byte[] b) throws IOException {
        original.write(b);
    }

    @Override
    public void write(int b) throws IOException {
        original.write(b);
    }

    @Override
    public void flush() throws IOException {
        original.flush();
    }

    @Override
    public void close() throws IOException {
       flush();
       String str = "JavaRush © All rights reserved.";
       original.write(str.getBytes());
       original.close();
    }
}
