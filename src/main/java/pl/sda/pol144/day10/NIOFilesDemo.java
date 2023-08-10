package pl.sda.pol144.day10;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class NIOFilesDemo {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("c:\\data\\pol144.txt");
        Path target = Paths.get("c:\\data\\copy.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

        // Wyświetlenie zawartości pliku
        Files.lines(source).forEach(System.out::println);

        // skopiowanie z zamianą na wielkie litery
        final List<String> list = Files.lines(source).map(s -> s.toUpperCase()).toList();
        Files.write(target, list, StandardOpenOption.APPEND);

    }
}
