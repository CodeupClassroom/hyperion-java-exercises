package interfaces_abstract_classes;

public class Dev extends Employee {

    public Dev(String name, int age, String workLocation) {
        super(name, age, workLocation);
    }

    @Override
    public void doWork() {
        System.out.println("Writing up code, and slurpin' down caffeine. Please turn off the lights on the way out.");
    }

    @Override
    public void introduction() {
        System.out.format("Hi, I'm %s. I work as a developer here in %s. Can I got back to work now?%n", this.getName(), this.getWorkLocation());
    }

    public void writeCode() {
        System.out.println("Writing code... and... done!");
    }

    public static void main(String[] args) {
        Dev debra = new Dev("Debra Baker", 44, "Wakefield, MA");
        debra.doWork();
        debra.introduction();
        debra.writeCode();
        debra.statusReport();
        debra.eat();

        Employee craig = new Dev("Craig Summers", 38, "Aurora, IL");
        craig.doWork();
        craig.introduction();
//        craig.writeCode();

    }
}
