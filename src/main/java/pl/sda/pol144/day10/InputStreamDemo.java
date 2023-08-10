package pl.sda.pol144.day10;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
        // InputStream input = new FileInputStream("c:\\data\\pol144.txt");
        InputStream input = System.in;
        int b = 0;
        while((b = input.read()) != -1) {
            System.out.println((char) b);
        }
        input.close();
    }
}
