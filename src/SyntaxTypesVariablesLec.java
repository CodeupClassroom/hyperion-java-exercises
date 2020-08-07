public class SyntaxTypesVariablesLec {
    public static void main(String[] args) {
        // Let's talk Java!

        // Statements! We made one of those already!
//        System.out.println("Hello, World!");

        // Statements direct the operation of our code. Important! Unlike JavaScript, Java REQUIRES semicolons (;) at the end of out lines of code.

        // Comments! Look familiar huh?

        /**
         *
         * "So David, is this what you meant when you said Java and JavaScript have similar syntax?"
         *
         */

        // Yes.

        // Data Types. There's a bunch.

        // First a difference between primitive and reference types.

        // Primitive - building blocks of objects (numbers, boolean, and characters)

        // Reference - Objects, Arrays, Collections, null, and Strings.

        // boolean

        boolean areWeLearningJava = true;
        boolean areWeLearningRuby = false;

        // char
        char firstLetterOfDavid = 'D';
        char lastLetterOfDavid = 'd';

        // numbers, unlike in JavaScript, there are multiple number data types.
        // byte - contains a whole number value from -128 to 127
        byte howManyOreoesIShouldHave = 2;

        // short - Whole numbers from -32768 to 32767
        short howManyOreoesIWant = 12000;

        // int - Whole numbers from -2147483648 to 2147483647
        int howManyOreoesICouldEat = 280000000;

        // long - whole numbers from -9223372036854775808 to 9223372036854775807
        long howMuchMoneyIWishIHadInSavings = 9223372036854775807L;

        // float = Floating point number with up to 7 significant digits
        float pi = 3.14F;
//        System.out.println(pi);

        // double - (double precision) Floating point number with up to 16 significant digits
        double piDouble = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679;
//        System.out.println(piDouble);

        // Strings - Unlike JS, held in double quotes ("")
        String davidFullName = "David Andrew Stephens";

        // How to special characters in Strings
        // Quotation mark
        String quotationMarkExample = "As my dad told my brother once, \"Better out than in.\"";
//        System.out.println(quotationMarkExample);

        // Backslash
        String backslashExample = "Behold! The quintuple backslash! \\\\\\\\\\";
//        System.out.println(backslashExample);

        // Newline character
        String newlineExample = "Coming soon:\nRush Hour 4";
//        System.out.println(newlineExample);

        // Tab
        String tabExample = "\tAnd so it was, I knew I had to avenge my grandfather by becoming the greatest jazz guitarist of them all.";
//        System.out.println(tabExample);

        // So take a note of how I instantiated my different variables. They were all brought about with the type of the variable before the identifier name.

        // type identifier =(assignment operator) value

        // constants - best practice, identifiers in SCREAMING_SNAKE_CASE
        final String NAME_OF_DAVID = "David A. Stephens";
//        NAME_OF_DAVID = "Natalie Davenportman";

        // Arithmetic Expression
//        System.out.println(++howManyOreoesIShouldHave);
//        System.out.println(howManyOreoesIShouldHave);

        // Casting
        int myFavoriteNumber = 129;
        long myFavoriteNumberButWithMoreByteSpace = myFavoriteNumber;
        byte myFavoriteByte = (byte) myFavoriteNumber;

//        System.out.println(myFavoriteByte);
        long maximumLong = Long.MAX_VALUE;
        int aMistakeHappensHere = (int) maximumLong;
        System.out.println(aMistakeHappensHere);

    }
}
