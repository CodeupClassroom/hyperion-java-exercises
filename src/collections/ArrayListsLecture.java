package collections;

import collections.toyota.Car;
import collections.toyota.EightSix;
import collections.toyota.LandCruiser;
import collections.toyota.Tundra;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListsLecture {
    // In Java, we learned that Arrays don't quite work the same as in JavaScript... They have a defined length, and when we wish to add to an array, we have to make a copy of the array. Luckily, Java has many different types of collections that we can use.

    // Today we are going to talk about ArrayLists and HashMaps.

    // An ArrayList is a list that works most closely to the Arrays we used in JavaScript. Meaning, we can add to an array list without having to make a new copy.

    static String[] cheeseArray = new String[4];
    // To create an ArrayList, we'll instantiate it like so...
    static ArrayList<String> someCheeses = new ArrayList<>();

    // Notice how I specify the data type of the elements of this list inside of the angle brackets (<>).

    // Just like arrays I can also add elements to the ArrayList at creation.

    static private ArrayList<String> cheeses = new ArrayList<>(Arrays.asList("Muenster", "Swiss", "Mozzarella", "Muenster", "Provolone", "Nut Rebel", "Bleu de Gex", "Moose", "Ricotta", "Cheddar", "Colby", "Havarti"));

    static private ArrayList<Car> lot = new ArrayList<>(Arrays.asList(new EightSix(), new LandCruiser(), new Tundra(), new Tundra(), new EightSix()));

    static private ArrayList<Integer> nums = new ArrayList<>();

    public static void main(String[] args) {
        nums.add(2);
        nums.add(17);
        nums.add(34);
        nums.add(88);
        // There are a couple different methods we can use when working with the ArrayList class.

        // .size() - Returns the size (length) of an ArrayList.
//        System.out.println(cheeses.size());

        // .add() - Will allow us to add an element to an ArrayList.

        //We can add the element at the end...
        cheeses.add("Kraft American Singles");
//        System.out.println(cheeses.size());
//
//        for (String cheese : cheeses) {
//            System.out.println(cheese);
//        }

        // We can also add at an index:
        cheeses.add(9, "White Cheddar");

//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
//        System.out.println(cheeses.size());
//        for (String cheese : cheeses) {
//            System.out.println(cheese);
//        }

        // Notice what happened... We added the element, but...

//        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        // .get() - Return the element at a given index.

        int initialDCars = 0;

        for (int i = 0; i < lot.size(); i++) {
            if (lot.get(i).getModel().equalsIgnoreCase("86")) {
                initialDCars++;
            }
        }

//        System.out.printf("I have %d 86's to sell!%n", initialDCars);

        // .indexOf() - Returns the first index of an element.

//        System.out.println(cheeses.indexOf("Muenster"));

        // notice how this doesn't work... (Returns -1)
//        System.out.println(lot.indexOf(new EightSix()));
//
//        System.out.println(new EightSix());
//        for (Car car : lot) {
//            System.out.println(car);
//        }

        // but this will...
        LandCruiser lc = new LandCruiser();
        lot.add(lc);
//        System.out.println(lot.indexOf(lc));

        // Why?

        // .contains() - Will return a boolean based off whether a value is in an ArrayList.

//        System.out.println(cheeses.contains("Muenster"));
//        System.out.println(cheeses.contains("Cottage"));

        // What would we expect to see here?
//        System.out.println(lot.contains(new LandCruiser()));

        // .lastIndexOf() - will return the last index of an element in an ArrayList.
//        System.out.println(cheeses.lastIndexOf("Muenster"));

        // .isEmpty() - Returns a boolean based on whether an ArrayList is empty.
//        System.out.println(someCheeses.isEmpty());

        // .remove() - Works one of two ways...

        // Removes the passed argument from an ArrayList:
        cheeses.remove("Kraft American Singles");
        cheeses.remove(3);
//        for (String cheese : cheeses) {
//            System.out.println(cheese);
//        }

        nums.remove((Integer) 17);

//        for (int num : nums) {
//            System.out.println(num);
//        }


        // POP QUIZ! What'll happen if I do this???

//        System.out.println(lot.size());
//        lot.remove(new LandCruiser());
//        System.out.println(lot.size());

//        System.out.println(cheeses.get(4));

        //// Take a break... Then we'll talk HashMaps!!!
    }



}
