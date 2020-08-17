import java.util.ArrayList;
import java.util.List;

public class PolymorphismDemo {
    // Let's create a 'Manager' class (in the Employee class), that extends the 'Employee' class
    public static void main(String[] args) {
        Employee casey = new Employee("Casey");
        Employee david = new Manager("David"); // polymorphism

        ArrayList<Integer> intArrayList = new ArrayList<>();

        // class ArrayList extends List {

        List<Integer> intList = intArrayList;

        // Creating a wrapper called `david`, in the type of Employee,
        //   assigning a `Manager` object to `david`, which satisifes all methods & properties
        //    of the `Employee` class

        Employee gordonRamsay = new Cook("Gordon Ramsay");

        Person[] workTeam = new Person[3];
        workTeam[0] = casey;
        workTeam[1] = david;
        workTeam[2] = gordonRamsay;

        Manager[] theBosses = new Manager[3];

        // theBosses[0] = david;


        work(casey);
        work(david);
        work(gordonRamsay);


    }

    // Write a method 'doWork()' that will work for Employee AND Manager objects, even when both are cast as an Employee object
    public static void work(Employee e) {
        e.doWork();
    }
}

class Cook extends Employee {
    // the Cook class inherits methods/properties from Employee
    public Cook(String cookName) {
        super(cookName);
    }
    public void doWork() {
        System.out.println("Luv them tacos!");
    }
}

// the FINAL keyword
final class Movie {
    // immutable - CAN'T CHANGE IT, EXTEND IT, INHERIT IT.
    // BOOYAH.
}
class Drama extends Movie {

}

class Hammer {
    public final String smackNail() {
        return "One nail down, twenty-thousand to go";
    }
}
class SledgeHammer extends Hammer { // inheritance --> Slegdehammer (subclass) | Hammer (superclass)
    public String smackNail() {
        return "Just sunk 10 nails at once";

    }
}