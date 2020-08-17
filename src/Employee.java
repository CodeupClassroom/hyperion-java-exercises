import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

// let's have this Employee class *extend* the Person class
public class Employee extends Person {
    // by _extending_ the Person class, the Employee class will have all of
    //   its properties and methods

    // instantiate ==~ initialize

    // 4. Define some new properties only in this Employee class
    private double salary;
    private int employeeNumber; // private - only available in THIS class
    protected String jobTitle;  // protected - available here, and any class that INHERITS/extends this class
    private int[] jobScores;

    public static void main(String[] args) {

        // 2. instantiate an Employee object
        Employee casey = new Employee("casey");
        casey.setJobTitle("Web Development Instructor");

        // 3. call a _Person_ method on the _Employee_ object
        // casey.sayHello();

        // int bucket;
        // for (int i = 0; i < 19; i++) {
        //     // at some point
        //     bucket = array[i];
        // }
        //
        // runMethod(bucket);

        // 6. Run the method we defined in this class
        // casey.doWork();

        // 7. Instantiate a Person object and run the _doWork_ method on it
        Person david = new Person("david");
        System.out.println("Person says: ");
        // david.sayHello();
        david.sayHello();
        System.out.println("Employee says: ");
        casey.sayHello();
        System.out.println("casey regular speak real good: ");
        casey.personHelloTalk();
    }

    // 1. create a constructor
    public Employee(String employeeName) {
        super(employeeName);
    }

    // when we build our extended class, we'll need to call out to its superclass

    // 5. Create a method only available to this Employee class
    public void doWork() {
        System.out.println("Work, work, ...");
    }

    // 8. Override the sayHello() method from the superclass
    public void sayHello() {
        System.out.println("Hello, my name is " + this.getName() + ", and my job title is: " + this.getJobTitle());
    }

    public void personHelloTalk() {
        super.sayHello();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int[] getJobScores() {
        return jobScores;
    }

    public void setJobScores(int[] jobScores) {
        this.jobScores = jobScores;
    }
}

class Manager extends Employee { // inheritance

    public static void main(String[] args) {
        Manager tristan = new Manager("Tristan");

        tristan.personHelloTalk();
    }
    // constructor
    public Manager(String managerName) {
        super(managerName);
    }

    public void doWork() {
        System.out.println("Haha u wish");
    }

}