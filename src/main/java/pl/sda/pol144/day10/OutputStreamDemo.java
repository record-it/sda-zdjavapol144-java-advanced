package pl.sda.pol144.day10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //OutputStream outputStream = new FileOutputStream("c:\\data\\output144.txt");
        OutputStream outputStream = System.out;
        byte[] bytes = {113, 114, 115, 116};
        outputStream.write(bytes);
        outputStream.close();
    }
}
