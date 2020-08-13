import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        setScanner(scanner);

        // Game picks a random number between 1 and 100.
        int randomNum = (int)(Math.random()*100) + 1;

        // Prompts user to guess the number.
        int userGuess = 0;
        int numberOfGuesses = 0;
        while(true) {
            System.out.print("Please guess the random number: ");
            userGuess = scanner.nextInt();
        // All user inputs are validated.
            if( userGuess < 1 || userGuess > 100 ) {
                System.out.println("Your guess is out of the guessing bounds. Try again.");
            } else {
                // see if the validated guess was correct, too high, or too low
                String results = checkGuess(userGuess, randomNum); // 'higher', 'lower', 'You guessed correctly!'
                if (results.equals("You guessed correctly!")) {
                    // they guessed correctly, so break out of the loop
                    System.out.println(results);
                    System.out.println("Took you " + numberOfGuesses + " guesses");
                    break;
                } else {
                    // they guessed too high/low, give them a hint, and continue
                    //  looping
                    System.out.println(results);
                }
            }
            numberOfGuesses++;
        } // we now have a guess between 1 - 100

    }

    public static String checkGuess(int guess, int targetNum) {
        // returns whether guess is:
        if (guess == targetNum) {
            //   c) correct
            return "You guessed correctly!";
        } else if(guess < targetNum) {
            //   a) too high
            return "Higher...";
        } else if(guess > targetNum) {
            //   b) too low
            return "Lower...";
        }
        return "error";

    }

    // If user's guess is less than the number, it outputs "HIGHER".
    // If user's guess is more than the number, it outputs "LOWER".
    // If a user guesses the number, the game should declare "GOOD GUESS!"

    // make a scanner
    private static Scanner scanner;
    public static void setScanner(Scanner s) {
        scanner = s;
    }
}
