package fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileIOLecture {
    public static HashMap<String, String> bookList = new HashMap<>();
    public static Path p = Paths.get("./data/books.txt").normalize();

    public static void buildOutBookList() {

        List<String> contacts = new ArrayList<>();
        try {
            contacts = Files.readAllLines(p);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String contactInfo : contacts){
            String[] info = contactInfo.split(" \\*\\*\\|\\*\\* ");
            bookList.putIfAbsent(info[0], info[1]);
        }
    }

    public static void main(String[] args) {
        System.out.println(p);
        buildOutBookList();
        Set<String> titles = new TreeSet<>(bookList.keySet());
        for (String title : titles) {
            System.out.printf("%s --- %s%n", title, bookList.get(title));
        }
    }
}
