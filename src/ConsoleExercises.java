import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String args[]) {

        // Write some Java code that uses the variable pi to output the following:
        // The value of pi is approximately 3.14.
        double pi = 3.14159;
        System.out.printf("\nThe value of pi is approximately %.2f.\n\n", pi);

        // Prompt a user to enter a integer and store that value in an int variable using the nextInt method
        //What happens if you input something that is not an integer? (java.util.InputMismatchException)
        Scanner scanner = new Scanner(System.in);
//        scanner.useDelimiter("\n");
        System.out.print("Enter an integer: ");
        int i = scanner.nextInt();
        System.out.println("You entered: --> \"" + i + "\" <--");


        // Prompt a user to enter 3 words, and store each of them in a separate variable.
        // Then, display them back in the console, each on a newline.
        //What happens if you enter less than 3 words?
        //What happens if you enter more than 3 words?
        System.out.print("\nEnter 3 words: ");
        String word01, word02, word03;
        word01 = scanner.next();
        word02 = scanner.next();
        word03 = scanner.next();
        System.out.printf("\n the words are \"%s\", \"%s\", and \"%s\".\n", word01, word02, word03);
        scanner.nextLine();

        // Prompt a user to enter a sentence, then store that sentence in a String variable using the next method.
        // Then, display that sentence back to the user.
        System.out.print("\nEnter a sentence: ");
        scanner.useDelimiter("\n");
        String sentence = scanner.next();
        scanner.nextLine();
        System.out.printf("\nThe sentence is \"%s\"\n", sentence);

        // Rewrite the above example using the nextLine method.
        System.out.print("\nEnter a sentence: ");
        sentence = scanner.nextLine();
        System.out.printf("\nThe sentence is \"%s\"\n", sentence);

        // Calculate the perimeter and area of Codeup's classrooms.
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter the width: ");
        String sWidth = scan.nextLine();
        double width = Double.parseDouble(sWidth);
        System.out.print("Enter the length: ");
        String sLength = scan.nextLine();
        double length = Double.parseDouble(sLength);
        System.out.printf("The dimensions are %.2f feet by %.2f feet. The perimeter is %.2f feet and the area is %.2f sq. ft.\n",
                length, width, 2*(length+width), length*width);

    }
}
