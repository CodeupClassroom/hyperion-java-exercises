public class MethodsLec {

    /****** Our lovely psvm ! *******/
    public static void main(String[] args) {
        // We're in main - why create a method?
    }


    /****** A method, that can do stuff ******/
    public static String sayHello(String name) {
        return String.format("Hello, %s!", name);
    }

    // let's make a few more methods with different return types / input arguments
    //    just to see how they work

    // make the sayHello method a 'void' method. how is this different?

    // make a method that returns the int '4'

    // make a method called 'shout' that converts an input argument to uppercase,
    //    then adds '!!!', and returns that string

    /************* CALLING METHODS **************/
    // call the above methods from our psvm (public static void main)

    // how could we make those calls break?

    /************* METHOD OVERLOADING ************/

    // What is method overloading? Why would we use it?

    // let's write a method, and overload it a handful of times, then call that method in
    //   multiple ways that take advantage of its overloading


    // version 1
    // public static void sayHello(int times) {
    //     for (int i = 0; i < times; i += 1) {
    //         sayHello();
    //     }
    // }
    // // version 2
    // public static void sayHello() {
    //     sayHello("Hello", "World");
    // }
    // // version 3
    // public static void sayHello(String name) {
    //     sayHello("Hello", name);
    // }
    // // version 4
    // public static void sayHello(String greeting, String name) {
    //     System.out.println(greeting + ", " name "!");
    // }


    /************* PASSING PARAMETERS TO METHODS ************/
    // public static void changeString(String s) {
    //     s = "Wub a lub a dub dub";
    // }
    //
    // public static void main(String[] args) {
    //     String changeMe = "hello codeup!";
    //
    //     changeString(changeMe);
    //
    //     System.out.println(changeMe);
    // }

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
