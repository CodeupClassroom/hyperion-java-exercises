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

        String changeMe = "hello codeup!"; // changeMe is at @4bbd768b in memory
        System.out.println("Printing the string's location in memory: ");
        System.out.println(Integer.toHexString(changeMe.hashCode()));
        changeMe = changeString(changeMe);
        System.out.println(Integer.toHexString(changeMe.hashCode()));

        final CohortStudent casey1 = new CohortStudent();
        System.out.println("First Instance of Casey @memory: ");
        System.out.println(Integer.toHexString(casey1.hashCode()));
        System.out.println("Second Instance of Casey @memory: ");
        System.out.println(Integer.toHexString(casey1.hashCode()));
        // System.out.println(s);
        // changeMe = changeString(changeMe);
        // System.out.println(changeMe);

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

    /****** without recursion *********/
    // public static long getPower(int base, int exponent) {
    //     long result = 1;
    //     for (int i = 1; i <= exponent; i++) {
    //         result = result * base;
    //     }
    //     return result;
    // }

    /********* refactored, WITH recursion *********/
    // public static long getPower(int base, int exponent) {
    //     if (exponent == 0) {
    //         return 1;
    //     } else if (exponent == 1) {
    //         return base;
    //     } else if (exponent == 2) {
    //         return base * base;
    //     }
    //     return base * getPower(base, exponent - 1);
    // }




}
