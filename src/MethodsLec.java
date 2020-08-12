public class MethodsLec {

    /****** Our lovely psvm ! *******/
    public static void main(String[] args) {
        // We're in main - why create a method?
        // System.out.println(sayHello("Casey"));
        //
        // String helloText = sayHello("World");
        // if(helloText.equalsIgnoreCase("hello, world!")) {
        //     System.out.println("We got what we were looking for");
        // }
        // String hiText = sayHello("Casey");
        //
        // sayHi("Casey");
        //
        // System.out.println("Running the square of a number");
        // System.out.println(square(2));
        //
        // int number = 5;
        // int numberSquared = square(number);
        //
        // System.out.println("numberSquared = " + numberSquared);
        // System.out.println(four());

        // String message = shout("i love this company");
        //
        // System.out.println(shout("i love this company"));
        //
        // printGreeting();
        // printGreeting("Casey");
        // printGreeting("Casey", 34);

        // String changeMe = "hello codeup!"; // changeMe is at @4bbd768b in memory
        // System.out.println("Printing the string's location in memory: ");
        // System.out.println(Integer.toHexString(changeMe.hashCode()));
        // changeMe = changeString(changeMe);
        // System.out.println(Integer.toHexString(changeMe.hashCode()));
        //
        // final CohortStudent casey1 = new CohortStudent();
        // System.out.println("First Instance of Casey @memory: ");
        // System.out.println(Integer.toHexString(casey1.hashCode()));
        // System.out.println("Second Instance of Casey @memory: ");
        // System.out.println(Integer.toHexString(casey1.hashCode()));
        // System.out.println(s);
        // changeMe = changeString(changeMe);
        // System.out.println(changeMe);


        // *********** RECURSION ***************** //
        count(-99);

        // chopOffUntilTen Recursion Example
        System.out.println("The final chopped string is: " + chopOffUntilTen("abcdefghijklmnopqrstuvwxyz"));

        System.out.println("The full alphabet, reconstructed, is: " + buildUpUntilTwentySix("abcdef"));

        System.out.println("Built alphabet with ASCII tooling is: " + buildAlpha("abcdef"));
    }

    public static void count(int n) {
        if (n <= 0) { // what happens if we don't have this 'base case' check?
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n + 1);
    }
    // 5
    // 4
    // 3
    // 2
    // 1
    // 0

    // write a method that receives a string as input, and removes one letter from the end
    //   at a time, until the total number of characters is 10 or less
    //      return the resulting 10 character string (as a String)
    public static String chopOffUntilTen(String tree) {
        System.out.println(tree);
        if( tree.length() <= 11 ) {
            return tree;
        }
        // h e l l o c o d e u p r o c k s
        // 11 - 1 = 10
        return chopOffUntilTen( tree.substring(0,tree.length()-1) );
    }

    public static String buildUpUntilTwentySix(String alpha) {
        System.out.println(alpha);
        if ( alpha.length() >= 26 ) {
            return alpha;
        }
        //                             "abcdef"        "g"
        return buildUpUntilTwentySix(alpha + getNextLetter(alpha));
    }

    public static String buildAlpha(String alpha) {
        System.out.println(alpha);
        if(alpha.length() > 25) {
            return alpha;
        }
        return buildAlpha(alpha + (char)(alpha.length() + 97));
    }

    public static String getNextLetter(String partialAlphabet) {
        // get the last character from the 'partialAlphabet'
        //  return the next alpha letter as a character
        // 'abcdef' --> want to get the 'f', and find the next letter
        String lastLetter = partialAlphabet.substring(partialAlphabet.length()-1, partialAlphabet.length());
        switch (lastLetter) {
            case "a":
                return "b";
            case "b":
                return "c";
            case "c":
                return "d";
            case "d":
                return "e";
            case "e":
                return "f";
            case "f":
                return "g";
            case "g":
                return "h";
            case "h":
                return "i";
            case "i":
                return "j";
            case "j":
                return "k";
            case "k":
                return "l";
            case "l":
                return "m";
            case "m":
                return "n";
            case "n":
                return "o";
            case "o":
                return "p";
            case "p":
                return "q";
            case "q":
                return "r";
            case "r":
                return "s";
            case "s":
                return "t";
            case "t":
                return "u";
            case "u":
                return "v";
            case "v":
                return "w";
            case "w":
                return "x";
            case "x":
                return "y";
            case "y":
                return "z";
            case "z":
                return "";
        }
        return "error";
    }


    // public static void changeString(String s) {
    //     s = "Wub a lub a dub dub";
    // }
    public static String changeString(String s) {
        s = "Wub a lub a dub dub";
        return s;
    }

    /****** A method, that can do stuff ******/
    public static String sayHello(String name) {
        return String.format("Hello, %s!", name);
    }

    // let's make a few more methods with different return types / input arguments
    //    just to see how they work
    public static int square(int number) {
        return number * number;
    }

    // make the sayHello method a 'void' method. how is this different?
    public static void sayHi(String name) {
        System.out.println("Hi, " + name);
    }

    // make a method that returns the int '4'
    public static int four() {
        return 4;
    }

    // make a method called 'shout' that converts an input argument to uppercase,
    //    then adds '!!!', and returns that string
    public static String shout(String message) {
        return message.toUpperCase() + "!!!";
    }

    /************* CALLING METHODS **************/
    // call the above methods from our psvm (public static void main)

    // how could we make those calls break?

    /************* METHOD OVERLOADING ************/

    // What is method overloading? Why would we use it?

    // let's write a method, and overload it a handful of times, then call that method in
    //   multiple ways that take advantage of its overloading

    public static void printGreeting() {
        System.out.println("Greetings, to you, earthling");
    }

    public static void printGreeting(String name) {
        System.out.println("Greetings to you, " + name);
    }

    public static void printGreeting(String name, int age) {
        System.out.println("Grettings to you, " + name + "; you " + age + " year old human.");
    }


    /************* PASSING PARAMETERS TO METHODS ************/



    // what do we remember from our Strings lesson about why this works /
    //     what is happening with the actual string data?


    /************* RECURSION ****************/     //--------- ..... woo, doggy ... //

    // aim to solve a problem by breaking it into smaller chunks

    // public static void count(int n) {
    //     if (n <= 0) { // what happens if we don't have this 'base case' check?
    //         System.out.println("All done!");
    //         return;
    //     }
    //     System.out.println(n);
    //     count(n - 1);
    // }
    //
    // public static void main(String[] args) {
    //     count(5);
    // }

    /****** without recursion *********/  // 2 ^ 3 = 2 * 2 * 2 = 8
    // public static long getPower(int base, int exponent) {
    //     long result = 1;
    //
    //     for (int i = 1; i <= exponent; i++) {
    //         result = result * base;
    //         // 1 * 2 = 2
    //         // 2 * 2 = 4
    //         // 4 * 2 = 8
    //     }
    //     return result;
    // }

    /********* refactored, WITH recursion *********/

    // 2 ^ 3  =  2 * 2 * 2  =  8
    // public static long getPower(int base, int exponent) {
    //     if (exponent == 0) {
    //         return 1;
    //     } else if (exponent == 1) {
    //         return base;
    //     } else if (exponent == 2) {
    //         return base * base;
    //     }
    //     return base * getPower(base, exponent - 1);  // 2 * (result of getPower(2,2)) = 2 * base * base = 2 * 2 * 2 = 8
    // }




}
