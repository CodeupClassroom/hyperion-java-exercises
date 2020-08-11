import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        // Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
        // He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
        // He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
        // He answers 'Whatever.' to anything else.

        Scanner sc = new Scanner(System.in);
        boolean again = true; // should we continue or not?
        do {
            System.out.print("Type @ Bob: ");
            String userInput = sc.nextLine(); // either a string, or empty string

            if( userInput.isEmpty() ) {
                System.out.println("Fine, be that way.");
            } else {
                char lastChar = userInput.charAt(userInput.length()-1); // last character
                switch(lastChar) {
                    case '?':
                        System.out.println("Sure");
                        break;
                    case '!':
                        System.out.println("Whoa, chill out!");
                        break;
                    default:
                        System.out.println("Whatever");
                        break;
                }

                // ask the user if they would like to continue
                System.out.print("DM Bob again? [y/N]: ");
                String response = sc.nextLine();
                if(!response.trim().equalsIgnoreCase("y")) {
                    again = false;
                }
            }

        } while(again);

        // user has clicked something other than y/Y, so exit with a message
        System.out.println("kthxbai");

    }

}
