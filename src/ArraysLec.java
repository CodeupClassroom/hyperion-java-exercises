import java.awt.image.AffineTransformOp;
import java.util.Arrays;
import java.util.Random;

public class ArraysLec {
    // Let's have some fun with arrays!

    public static void main(String[] args) {

        /* ***************   ******** ********************* */
        /* ******** WORKING WITH ARRAY ELEMENTS *********** */
        /* ************* ITERATING ARRAYS ***************** */
        /* ***************   ******** ********************* */

        // TODO: 1. Declare an int array called numbers without populating it
        //       2. Declare a String array called words with a length of 10
        //       3. Initialize an int array called temps with the 'array initializer syntax'
        int[] numbers;
        String[] words = new String[10];
        int[] temps = {34, 56, 36, 76, 94}; // length doesn't need to be provided, when using
                                                // array initializer syntax

        // TODO: 1. Using a for loop, iterate through the temps array and print each temp on a new line
        //       2. Using an advanced for, iterate through the temps array and print each temp on a new line
        //       3. Re-assign the third element with a temp of 38
        //       4. Print "Updated third temp: 38" to the console, using printf
        for (int i=0; i < temps.length; i++) {
            // System.out.println(temps[i]);
        }
        int sum = 0;
        for (int temp : temps) {
            sum += temp;
            // System.out.println(temp);
        }
        // System.out.println("Sum of all temperatures: " + sum);

        // TODO: 1. Create a string called 'horns', populated with 4 values, using array initializer syntax
        //       2. Print a random element to the screen, saying "_random_ is the best manufacturer!"
        String[] horns = {"Yamaha", "Conn", "Schmid", "Holton"};
        Random rand = new Random();
        int rand_int = rand.nextInt(4);
        System.out.println(horns[rand_int] + " is the best manufacturer!");




        /* ***************   ******** ********************* */
        /* ********* **** THE ARRAYS CLASS **** *********** */
        /* **************** 2D ARRAYS ********************* */
        /* ***************   ******** ********************* */

        // TODO: 1. Create an 'Instructor' class that stores an instructor's
        //           -- firstName
        //           -- lastName
        //           -- brainWaveFrequency
        //        -- Also, keep a count of the total number of instructors
        //       2. Print to the console when an instructor has been created
        //       3. Create Getters and Setters for names / brainwavefreq
        //       4. Create a method to display instructor stats
        //       5. Initialize an array full of instructor objects
        //       6. Instantiate three instructors (casey,david,tristan)
        //       7. Set each instructor's BrainWaveFrequency
        //       8. Add those instructors in the Instructor object array
        //       9. Iterate through the Instructor object array, and display each instructor's stats
        //       10. Create an array with only first names in it, and display it to the console
        //       11. Sum the brainwave frequencies, and display the total to the console
        //       12. Create a 2D array, and print it to the console, in grid form

        final int HYPERION_TEAM = 3;
        Instructor[] team = new Instructor[HYPERION_TEAM];

        Instructor casey = new Instructor("Casey", "Friday");
        Instructor david = new Instructor("David", "Stephens");
        Instructor tristan = new Instructor("Tristan", "Crawford");

        // Set each instructor's BrainWaveFrequency
        casey.setBrainWaveFrequency(55000);
        tristan.setBrainWaveFrequency(666);
        david.setBrainWaveFrequency(2);

        // Add those instructors in the Instructor object array
        team[0] = casey;
        team[1] = david;
        team[2] = tristan;

        for(Instructor instructor : team) {
            System.out.println(instructor.displayStats());
        }

        String[] firstNames = new String[3];
        // Create an array with only first names in it, and display it to the console
        for(int i=0; i < team.length; i++) {
            firstNames[i] = team[i].getFirstName();
        }
        for(String firstName : firstNames) {
            System.out.println(firstName);
        }

        // Sum the brainwave frequencies, and display the total to the console
        int freqSum = 0;
        for(Instructor instructor : team) {
            freqSum += instructor.getBrainWaveFrequency();
        }
        System.out.println("Total instructor processing power: " + freqSum + "MHz");

        // void Arrays.fill(array, value)
        // Arrays.fill(temps, 65);
        // void Arrays.sort(array)  sort temps[]
        // Arrays.sort(team);
        // System.out.println(Arrays.toString(team));
        // array Arrays.copyOf(array, length)
        Instructor[] team2 = Arrays.copyOf(team,3);
        boolean theSame = Arrays.equals(team, team2);
        if (theSame) {
            System.out.println("The arrays are the same");
        } else {
            System.out.println("The arrays are different");
        }
        // boolean Arrays.equals(array1, array2)
        // String Arrays.toString(array)
        System.out.println(Arrays.toString(team));


        // Create a 2D array, and print it to the console, in grid form


    }
}
