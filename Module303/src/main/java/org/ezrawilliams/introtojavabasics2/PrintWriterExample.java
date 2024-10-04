package org.ezrawilliams.introtojavabasics2;

import java.io.PrintWriter;

public class PrintWriterExample {
    public static void main(String[] args) {
        String data = "This is a text inside the file.";

        try {
            PrintWriter output = new PrintWriter("C:\\folder\\output.txt");
            output.print(data);
            output.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }


    }
}
