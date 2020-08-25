package fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class FileIOLecture {
    public static HashMap<String, String> bookList = new HashMap<>();
    public static Path p = Paths.get("./data/books.txt").normalize();
    private static String[] booksArr = {"Garfield Loses His Feet **|** Jim Davis", "Wicked Problems, Righteous Solutions **|** Peter DeGrace, Leslie Hulet Stahl", "Superfudge **|** Judy Blume"};
    public static ArrayList<String> defaultBooks = new ArrayList<>(Arrays.asList(booksArr));

    public static void buildOutBookList() {

        List<String> books = new ArrayList<>();
        try {
            books = Files.readAllLines(p);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String book : books){
            String[] info = book.split(" \\*\\*\\|\\*\\* ");
            bookList.putIfAbsent(info[0], info[1]);
        }
    }

    public static void main(String[] args) {
        if (Files.exists(p)) {
            System.out.println("Good to go!");
        } else {
            try {
                Files.createFile(p);
                System.out.println("File Created.");
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                Files.write(p, defaultBooks);
                System.out.println("Default books added to list.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        defaultBooks.remove(1);

        try {
            Files.write(p, defaultBooks);
            System.out.println("Default books added to list.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Files.write(p, Arrays.asList("The Giver **|** The Person who wrote The Giver", "A different book **|** some dude"), StandardOpenOption.APPEND);
            System.out.println("The Giver Added");
        } catch (IOException e) {
            e.printStackTrace();
        }

        buildOutBookList();
        Set<String> titles = new TreeSet<>(bookList.keySet());
        for (String title : titles) {
            System.out.printf("%s --- %s%n", title, bookList.get(title));
        }
        System.out.println(bookList);

    }
}
