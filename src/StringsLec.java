import java.util.Arrays;
import java.util.Scanner;

public class StringsLec {

    /********* Strings Fun-time *********/
    public static void main(String[] args) {

        /* Strings are Reference Types, not Primitives */
        /*    what does that mean? where are they, _actually_ ? */
        char letter = 'a'; // primitive
        String word = "funtime"; // reference

        /*** Immutability ***/

        /* Once you create a string, it can't be changed */
        String message = "Casey";
        // System.out.println(message); // prints "Casey"
        message = message + " Friday";
        // System.out.println(message); // prints "Casey Friday"
        // boolean authenticity = true;
        // int grades = 80 + "b";
        //
        // authenticity = authenticity + message;
        // System.out.println(message);

        // String s = new String("one");
        // System.out.println(Integer.toHexString(s.hashCode()));
        //
        // s = s + " Casey Friday";
        // System.out.println(Integer.toHexString(s.hashCode()));
        // System.out.println(s);
        /* Did we change the original, or make a brand new string? Why? */

        // when message = "Casey" -> 'message' is pointing to location @1ae66 in memory
        // when we add " Friday" -> we create a new reference type string, in memory
                //                                      i.e. @35ac65d0

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Continue? [continue/N] ");
        // String userInput = sc.next();

        // Why is this a bad idea?
        // boolean confirmation = userInput == "continue";
        // boolean confirmation = userInput.equals("continue");
        //
        // if(confirmation) {
        //     System.out.println("You said yes");
        // } else {
        //     System.out.println("You said no");
        // }

        // DON'T DO THIS - it will technically work, but only VERY rarely
        // if ("I am a string" == "I am a string") {
        //     System.out.println("Strings are equal");
        // }

        /************* STRING METHODS *************/
        // String input = "Codeup Rocks!";

        // input.equals("codeup rocks!"); // false
        // input.equals("Codeup Rocks!"); // true
        //
        // input.equalsIgnoreCase("codeup rocks!"); // true
        // input.equalsIgnoreCase("Codeup Rocks!"); // true
        //
        // String spongeBob = "cOdEuP rOcKs!";
        //
        // boolean result = spongeBob.equalsIgnoreCase("codeup rocks!");
        // boolean result2 = spongeBob.equalsIgnoreCase("CODEUP ROCKS!");
        //
        // String userCitySearch = "san antonio";
        //
        // boolean sanAntonioFound = userCitySearch.equalsIgnoreCase("San Antonio");

        // String lastSix = extractLast6(input);  // = 'Rocks!'
        // lastSix.equalsIgnoreCase('rOcKs!');

        // input.startsWith("codeup"); // false
        // // SKU's for foot massagers: FT389-xxxx
        // input.startsWith("FT389-"); // true
        // input.startsWith("ft389-"); // false
        // input.startsWith("Codeup"); // true
        //
        // input.endsWith("rocks");  // false
        // input.endsWith("rocks!"); // false
        // input.endsWith("Rocks!"); // true


        /********* STRING MANIPULATION ***********/
        String myString = "CiseyFriday* Codeup day Instructor fun day";

        //char charAt(int index)
        char capitalSee = myString.charAt(11);
        // System.out.println(capitalSee);

        //int indexOf(String subString)
        int codeupIndex = myString.indexOf("Codeup");
        System.out.println("Index of 'Codeup' is: " + codeupIndex);

        System.out.println("The character at 'codeupIndex' is: " + myString.charAt(codeupIndex));

        //int lastIndexOf(String subString)
        int lastDay = myString.lastIndexOf("day");
        int firstDay = myString.indexOf("day");
        System.out.println("First index of 'day' is at index: " + firstDay);
        System.out.println("Last index of 'day' is at index: " + lastDay);

        //int length()‚
        int stringLength = myString.length(); // 42
        System.out.println("The fifth from last character is: " + myString.charAt(stringLength - 5)); // charAt(37)
        // let's create a string of the last 5 characters in 'myString' and do stuff with it
        char[] lastFiveChar = new char[5]; // @71be98f5
        String lastFive = "";
        for (int i = 0; i < 5; i++) {
            // store each of the last 5 characters in a 'bucket', 1 at a time
            // adding to an existing string
            lastFive += myString.charAt((stringLength - 5) + i); // 1) 37 + 0, 2) 37 + 1, 3) 37 + 2

            // add to a char[]
            lastFiveChar[i] = myString.charAt((stringLength - 5) + i);

        }
        String convertedMyString = new String(lastFiveChar);
        System.out.println("The converted char[] last five are: " + convertedMyString);
        System.out.println("The last five characters in 'myString' are: " + lastFive);

        System.out.println("The length of 'myString' is: " + stringLength);

        //String replace(String pattern, String replacement)
        String replacedString = myString.replace('a','@');
        System.out.println("Replaced string result is: " + replacedString);

        // change the first 'a' to an '@'
        // String firstAyeOnly = myString.re


        //String substring(int beginIndex[, int endIndex])
        // find the first occurence of 'a'
        int firstA = myString.indexOf('a'); // 1

        // use the substring method to pull out 'everything before a' + 'everything after a'
        String beforeAye = myString.substring(0,firstA);

        //  then add those two strings with an '@' in the middle
        String afterAye = myString.substring((firstA + 1),stringLength);

        String awesomeness = beforeAye + "@" + afterAye;
        System.out.println("Awesomeness is: " + awesomeness);


        //String toLowerCase()
        String sonosWatts = "One point Twenty-One Jigowatts";
        System.out.println(sonosWatts.toLowerCase());

        //String toUpperCase()
        String cohortWaterFountain = "the water purifier needs more hepa";
        System.out.println(cohortWaterFountain.toUpperCase());

        //String trim()
        String historyRemembrance = "       The people declared Washington's Proclamation of Neutrality a pusillanimous trucking to Britain; despotically conceived and unconstitutionally promulgated.         ";
        System.out.println(historyRemembrance.trim());

        String betterHistory = historyRemembrance.trim(); // String Array -> built-in toString()
        System.out.println("Better History split: " + betterHistory.split(" "));
        // ['c', 'a', 's', 'e', 'y'] -> Arrays.toString(['c', 'a', 's', 'e', 'y']) // Char Array -> no built-in toString()

        // Get the third and fifteenth word in the string
        int histLength =betterHistory.length();
        String[] historyStringArray = new String[histLength];
        historyStringArray = betterHistory.split(" ");

        System.out.println("The plain string array: " + historyStringArray);

        System.out.println("The third word in betterHistory is: " + historyStringArray[2]);
        System.out.println("The fifteenth word in betterHistory is: " + historyStringArray[14]);
    }




}
