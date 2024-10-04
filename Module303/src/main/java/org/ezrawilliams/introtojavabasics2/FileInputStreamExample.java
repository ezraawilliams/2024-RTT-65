package org.ezrawilliams.introtojavabasics2;
/*
Unlike out character-based stream classes, byte based stream classes
read and write byte by byte.
 */

import java.io.*;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("C:/Users/EzraWilliams/" +
                    "Downloads/testingFile.txt");
            int i = 0;
            //System.out.println(fin.read());
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}

