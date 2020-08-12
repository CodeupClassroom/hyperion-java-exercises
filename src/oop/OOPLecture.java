package oop;

import java.util.Scanner;

public class OOPLecture {

    // What if I told you you've been using OOP for a while now?

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Looking at the line above, notice what's happening.
        // We instantiate a new Scanner object, that's been defined by the Scanner class

        System.out.println("Hello little critter! What's your name?");
        String name = scanner.nextLine();
        // Looking at the line above, notice what's happening.
        // We're making use of a method from the Scanner object scanner. The method is a defined field of the Scanner class.

        // Note how I differentiate between class and object.
        // Class is a defined type in Java. This can be both custom (we made it) and predefined (Oracle made it).
        // Object is an instance of the class.

        // Let's move to a new file...
    }

}
