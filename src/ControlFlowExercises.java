/**
 * Exercises
 * For all of the following exercises, create a new class named ControlFlowExercises with a main method.
 * After each exercise, commit your changes, then replace your code in the main method with the next exercise.
 */

import java.util.Scanner;

class ControlFlowExercises {
    /**
     * Driver program for exercises
     *
     * @param args
     */
    public static void main (String[] args) {
        ControlFlowExercises cfe = new ControlFlowExercises();
        cfe.whileTest();
//        cfe.doTest();
//        cfe.forTest();
//        cfe.fizzBuxx();
//        cfe.printPowerTable();
//        cfe.grades();
        System.out.printf("\nThe sums of 7 is %d\n", sumNums(7));
    }

    public static long sumNums(int num) {
        long sum = 0;

        int num2 = num;
        boolean negative = false;
        if (num2 < 0) {
            num2 *= -1;
            negative = true;
        }

        // Loop to sum
        for(int i=1;i<=num;i++) {
            sum += i;
        }
        if (negative) sum *= -1;

        return sum;
    }
    /**
     * Loop Basics
     *
     * While
     *
     * Create an integer variable i with a value of 5.
     * Create a while loop that runs so long as i is less than or equal to 15
     * Each loop iteration, output the current value of i, then increment i by one.
     * Your output should look like this:
     *
     * 5 6 7 8 9 10 11 12 13 14 15
     */
    public void whileTest() {
        System.out.print("While test\n\t");
        int i = 5;
        while (i < 16) {
            System.out.printf("%d ", i);
            ++i;
        }
        System.out.print("\n\n");
    }

    /**
     * Do While
     *
     * Create a do-while loop that will count by 2's starting with 0 and ending at 100.
     * Follow each number with a new line.
     *
     * Alter your loop to count backwards by 5's from 100 to -10.
     *
     * Create a do-while loop that starts at 2, and displays the number
     * squared on each line while the number is less than 1,000,000. Output should equal:
     */
    public void doTest() {

        // count by 2's starting with 0 and ending at 100.
        System.out.print("count by 2's starting with 0 and ending at 100\n");
        long i = 0;
        do {
            System.out.printf("\t%d\n", i);
            i += 2;
        } while (i < 101);
        System.out.print("\n\n");

        // count backwards by 5's from 100 to -10.
        System.out.print("count backwards by 5's from 100 to -10\n");
        i = 100;
        do {
            System.out.printf("\t%d\n", i);
            i -= 5;
        } while (i > -11);
        System.out.print("\n\n");

        // squared on each line while the number is less than 1,000,000
        System.out.print("squared while the number is less than 1,000,000\n");
        i = 2;
        do {
            System.out.printf("\t%d\n", i);
            i *= i;
        } while (i < 1_000_000);
        System.out.print("\n\n");
    }

    /**
     * For: Refactor the previous two exercises to use a for loop instead.
     */
    public void forTest() {
        System.out.print("for-loop tests\n\n");
        System.out.print("for-loop count 5 to 14\n\n");
        for (int i = 5; i < 16; ++i) {
            System.out.printf("%d ", i);
        }
        System.out.print("\n\n");

        // count by 2's starting with 0 and ending at 100.
        System.out.print("for-loop count by 2's starting with 0 and ending at 100\n");
        for (int i = 0; i < 101; i += 2) {
            System.out.printf("\t%d\n", i);
        };
        System.out.print("\n\n");

        // count backwards by 5's from 100 to -10.
        System.out.print("for-loop count backwards by 5's from 100 to -10\n");
        for (int i = 100; i > -11; i -= 5) {
            System.out.printf("\t%d\n", i);
        }
        System.out.print("\n\n");

        // squared on each line while the number is less than 1,000,000
        System.out.print("for-loop squared while the number is less than 1,000,000\n");
        for (long i = 2; i < 1000001; i *= i) {
            System.out.printf("\t%d\n", i);
        }
        System.out.print("\n\n");
    }

    /**
     * Fizzbuzz
     *
     * One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
     *
     * Write a program that prints the numbers from 1 to 100.
     * For multiples of three: print “Fizz” instead of the number.
     * For the multiples of five: print “Buzz”.
     * For numbers which are multiples of both three and five: print “FizzBuzz”.
     */
    public void fizzBuxx() {
        System.out.println("Fizz this Buzz: 0 to 100 ");
        for (int i = 0; i < 101; ++i) {
            if (i % 3 == 0) {
                System.out.print("Fizz");
                if (i % 5 == 0) {
                    System.out.print("Buzz");
                }
            } else if (i % 5 == 0) {
                System.out.print("Buzz");
            } else {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    /**
     * Display a table of powers.
     *
     * Prompt the user to enter an integer.
     * Display a table of squares and cubes from 1 to the value entered.
     * Ask if the user wants to continue.
     * Assume that the user will enter valid data.
     * Only continue if the user agrees to.
     */
    public void printPowerTable() {
        String response = "";
        int num = 0;
        Scanner s = new Scanner(System.in);
        System.out.printf("\n\n\n");
        do {
            System.out.print("To what number do you want to go? (max 99) ");
            response = s.nextLine();
            try {
                num = Integer.parseInt(response);
            } catch (NumberFormatException nfe) {
                System.out.print("INVALID ENTRY: enter an integer ");
                response = "y";
                continue;
            }
            if (num > 99) {
                System.out.print("The maximum number is 99 ");
                response = "y";
                continue;
            }

            // print the table
            System.out.println("Here is your table!\n" +
                    "\n" +
                    "number | squared | cubed\n" +
                    "------ | ------- | -----");
            for (int i = 1; i <= num; i++) {
                System.out.printf("%-6d | %-6d | %-6d\n", i, i*i, i*i*i);
            }
            System.out.printf("\n\n\nWould you like to print another chart? ");
            response = s.nextLine();
            System.out.printf("\n");
            if (response == null || response.length() == 0) break;
        } while (response.charAt(0) == 'y');
        System.out.printf("\n\nGoodbye\n\n");
        s.close();
    }

    /**
     * Convert given number grades into letter grades.
     *
     * Prompt the user for a numerical grade from 0 to 100.
     * Display the corresponding letter grade.
     * Prompt the user to continue.
     * Assume that the user will enter valid integers for the grades.
     * The application should only continue if the user agrees to.
     * Grade Ranges:
     *
     * A : 100 - 88
     * B : 87 - 80
     * C : 79 - 67
     * D : 66 - 60
     * F : 59 - 0
     *
     * Bonus
     * Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).
     */
    public void grades() {
        String response = "";
        int num = 0;
        Scanner s = new Scanner(System.in);
        System.out.printf("\n\n\n");
        do {
            System.out.print("Enter a grade: ");
            response = s.nextLine();
            try {
                num = Integer.parseInt(response);
            } catch (NumberFormatException nfe) {
                System.out.print("INVALID ENTRY: enter an integer ");
                response = "y";
                continue;
            }
            if (num > 100 || num < 0) {
                System.out.print("Invalid grade: Must be 0 to 100\n\n");
                response = "y";
                continue;
            }

            // convert to letter
            String grade = "";
            if (num > 97) grade = "A+";
            else if (num > 93) grade = "A";
            else if (num > 87) grade = "A-";
            else if (num > 86) grade = "B+";
            else if (num > 82) grade = "B";
            else if (num > 79) grade = "B-";
            else if (num > 76) grade = "C+";
            else if (num > 73) grade = "C";
            else if (num > 66) grade = "C-";
            else if (num > 59) grade = "D";
            else grade = "F";

            // print the table
            System.out.printf("Here is the grade:\n %2s", grade);
            System.out.printf("\n\n\nWould you like to process another grade? ");
            response = s.nextLine();
            System.out.printf("\n");
            if (response == null || response.length() == 0) break;
        } while (response.charAt(0) == 'y');
        System.out.printf("\n\nGoodbye\n\n");
        s.close();
    }
}
