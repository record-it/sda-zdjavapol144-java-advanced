package pl.sda.pol144.day10;

import java.io.*;

public class ReaderAndWriterDemo {
    public static void main(String[] args) throws IOException {
        // dekorowanie strumienia klasą buforująca
        BufferedReader reader = new BufferedReader(new FileReader("c:\\data\\pol144.txt"));
        // Writer writer = new FileWriter("c:\\data\\copypol144.txt");
        Writer writer = new PrintWriter(System.out);
        String z;
        // dekorator ma wygodne metody do odczytu całych wiersza jako łańcuch
        while((z = reader.readLine()) != null){
            System.out.println(z);
            writer.write(z);
            writer.flush();     // wymuszenie wysłania danych ze strumienia do urządzenia io
        }
        reader.close();
        writer.close();
    }
}
