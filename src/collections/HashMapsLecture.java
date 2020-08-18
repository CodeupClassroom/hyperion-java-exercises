package collections;

import java.util.HashMap;

public class HashMapsLecture {
    // HashMaps are a different kind of collection. Hash maps are collections that have data collected in key-value pairs. All keys must be of the same data type. All values must be of the same data type. Keys do not have to have the same data type as their values.

    // Let's define a HashMap...
    static HashMap<Character,String> cheeses = new HashMap<>();

    // Notice how I wrote Character... Collections will not accept primitive types, so we'll need to use reference types.
    public static void main(String[] args) {
        // Here are some methods to use with HashMaps:
        // .put() - puts a key value pair in the HashMap.

        cheeses.put('A', "Muenster");
        cheeses.put('B', "Cheddar");
        cheeses.put('C', "Havarti");
        cheeses.put('D', "Nut Rebel");
        cheeses.put('B', "White Cheddar");

//        for (HashMap.Entry<Character, String> entry : cheeses.entrySet()) {
//            System.out.println(entry.getKey() + " | " + entry.getValue());
//        }

        // Notice how with the put method I can overwrite that value at a key by using a duplicate.

        // putIfAbsent() - Will only put if the key is unoccupied.
        cheeses.putIfAbsent('B', "Cheddar");
        cheeses.putIfAbsent('E', "Cheddar");

//        for (HashMap.Entry<Character, String> entry : cheeses.entrySet()) {
//            System.out.println(entry.getKey() + " | " + entry.getValue());
//        }

        // .get() and .getOrDefault() - Both will get an element at a key.
//        System.out.println(cheeses.get('C'));
//        System.out.println(cheeses.get('F'));

        // The difference is that getOrDefault will return a default value we can define instead of null if there is no value to get at that key.
//        System.out.println(cheeses.getOrDefault('F', "I'm sorry, there is not value for that key..."));

        // .containsKey() - Returns a boolean based on whether a key is a part of the HashMap.
//        System.out.println(cheeses.containsKey('D'));

        // .containsValue() - Returns a boolean based on whether a value is a part of the HashMap.
//        System.out.println(cheeses.containsValue("Kraft American Singles"));

        // .remove()
        cheeses.remove('E');
        cheeses.remove('B', "Havarti");
//        for (HashMap.Entry<Character, String> entry : cheeses.entrySet()) {
//            System.out.println(entry.getKey() + " | " + entry.getValue());
//        }

        // .replace()
        cheeses.replace('B', "Havarti");
        cheeses.replace('C', "Cheddar");
        cheeses.replace('Q', "Bleu de Gex");

//        for (HashMap.Entry<Character, String> entry : cheeses.entrySet()) {
//            System.out.println(entry.getKey() + " | " + entry.getValue());
//        }

        // .clear()
//        System.out.println("Clearing Cheeses HashMap");
        cheeses.clear();
//        for (HashMap.Entry<Character, String> entry : cheeses.entrySet()) {
//            System.out.println(entry.getKey() + " | " + entry.getValue());
//        }

        // .isEmpty()
//        System.out.println("cheeses.isEmpty() => " + cheeses.isEmpty());
    }

}