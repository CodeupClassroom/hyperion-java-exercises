import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        // Create an array that holds 3 Person objects
        // Person p1 = new Person("maximilian");
        // Person p2 = new Person("quixote");
        // Person p3 = new Person("wallendorf");

        Person[] people = new Person[3];
        people[0] = new Person("maximilian");
        people[1] = new Person("quixote");
        people[2] = new Person("wallendorf");

        for(Person thisPerson : people) {
            System.out.println(thisPerson.getName());
        }

        System.out.println("Adding a new person...");

        Person casey = new Person("Casey");

        Person[] updatedPeople = new Person[people.length + 1];
        updatedPeople = addPerson(people, casey);

        System.out.println("Printing out updated people array...");
        for(Person thisPerson : updatedPeople) {
            System.out.println(thisPerson.getName());
        }


        // Iterate through the array and print out first names of each person

    }
    public static Person[] addPerson(Person[] exsistingPeople, Person newPeep) {
        // add newPeep to the existing people
        // Using a loop (manual and tedious and boring)
        // Person[] updatedPeeps = new Person[exsistingPeople.length + 1];
        // for(int i=0; i < exsistingPeople.length; i++) {
        //     updatedPeeps[i] = exsistingPeople[i];
        // }
        // Using the copy method (fun, fun, fun!)
        Person[] updatedPeeps = Arrays.copyOf(exsistingPeople, exsistingPeople.length + 1);

        // [1, 2, 3 ] ==> [1, 2, 3, 4]  / we want to add to '4', updatePeeps[4]
        updatedPeeps[exsistingPeople.length] = newPeep;

        // return the newly crafted array with all the peeps inside of it
        return updatedPeeps;
    }
}
