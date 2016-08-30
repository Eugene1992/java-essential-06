package cw10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.IllegalFormatCodePointException;

public class ExceptionsExample {
    public static void main(String[] args) throws IOException {
        writeIntoFile("C:\\Users\\Student\\Desktop\\test2.txt");
    }

    static void writeIntoFile(String filename) throws IOException, ArithmeticException {
        String mycontent = "This is my Data which needs to be written into the file";
        FileOutputStream fis = new FileOutputStream(filename);
        fis.write(mycontent.getBytes());
        fis.flush();
        fis.close();
    }
}
