import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        // call methods here, once they are written

        //addition
        System.out.println("Testing 2 + 5 = " + add(2, 5));

        // subtraction
        System.out.println("Testing 56 - 9 = " + subtract(56, 9));

        // multiplication
        System.out.println("Testing 5 * 10 = " + multiply(5, 10));

        // division
        System.out.println("Testing 49 / 7 = " + divide(49, 7));
        // System.out.println("Testing 49 / 0 = " + divide(49, 0));

        // modulus
        System.out.println("Testing 5 % 3 = " + modulus(5, 3));

        // multiply without *
        System.out.println("5 * 3 recursively = " + multiplyRecursively(5, 3));

        // enter a number within a range
        System.out.println("Enter a number between 1 and 16: ");
        System.out.println("Your factorial result = " + factorial(getInteger(1, 16)));

        Scanner scanner = new Scanner(System.in);
        setScanner(scanner);
        // Dice Game
        diceGame();


    }

    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) throws ArithmeticException {
        // take into account dividing by zero
        if(b == 0) {
            throw new ArithmeticException("Divide by 0 attempt in divide() method");
        }
        return a / b;
    }
    public static int modulus(int a, int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("You tried to divide by zero");
        }
        return a % b;
    }

    public static int multiplyRecursively(int a, int b) {
        int product = 0;
        if( a > 0 ) {
            // i.e. 5 * 3      3     +      multiplyRecursively(4, 3);
            product = b + multiplyRecursively(a - 1, b);
        } else if (a < 0) {
            product = (0 - b) + multiplyRecursively(a + 1, b);
        }
        return product;
    }

    // check if input is within range
    public static int getInteger(int min, int max){
        // i.e. see if number is between 1 and 10

        Scanner sc = new Scanner(System.in);

        boolean doAgain = true;
        int num = 0;
        do {
            num = sc.nextInt();
            if( num < min || num > max ) {
                System.out.printf("\nThe integer %d is out of range\n",num);
                System.out.printf("Enter an integer between %d and %d: ",min, max);
            } else {
                doAgain = false; // they did enter a number within range, so break while
            }
        } while(doAgain); // if we get a correct number (1 < x < 10), break out of while
        return num;
    }

    // Calculate the Factorial
    public static long factorial(int num) throws ArithmeticException {
        // factorial(5) = 5 * 4 * 3 * 2 * 1
        int factorial = 1;
        int previousFactorial = 1;
        for (int i = 1; i <= num; ++i) {
            factorial = factorial * i;
            if (previousFactorial > factorial) {
                // part of bonus, to check if we have reached int overflow
                throw new ArithmeticException("The factorial of " + num +
                        " is too large to be represented by a long value;" +
                        "it broke at " + i);
            }
        }
        return factorial;
    }

    // Dice Game

    // Ask the user to enter the number of sides for a pair of dice.
    // Prompt the user to roll the dice.
    // "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
    // Use static methods to implement the method(s) that generate the random numbers.
    // Use the .random method of the java.lang.Math class to generate random numbers.

    // make a scanner
    private static Scanner scanner;
    public static void setScanner(Scanner s) {
        scanner = s;
    }

    public static void diceGame() {
        // Ask the user to enter the number of sides for a pair of dice.
        System.out.print("How many sides will be on each die? (1 to 20): ");
        int numSides = getInteger(1,20);

        while(true) {
            System.out.print("Hit enter to roll the dice, type 'exit' to exit: ");
            String response = scanner.nextLine();

            if (response.length() != 0 ) {
                break; // typed in in 'exit' or other wise - exiting the program
            }
            // they hit the enter key

            // generate dice rolls for 2 die
            int diceSum = 0;

            // going to generate a random number between 1 and (numSides)
            int diceValue1 = (int)(Math.random() * numSides) + 1;
            int diceValue2 = (int)(Math.random() * numSides) + 1;
            System.out.println("Dice 1: " + diceValue1);
            System.out.println("Dice 2: " + diceValue2);
            // 0 < x < 1     // *20  0.0001 < 19.99999
        }


        // Prompt the user to roll the dice.
        // "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
        // Use static methods to implement the method(s) that generate the random numbers.
        // Use the .random method of the java.lang.Math class to generate random numbers.

    }

}
