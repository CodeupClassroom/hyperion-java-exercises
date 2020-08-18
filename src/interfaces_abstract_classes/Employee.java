package interfaces_abstract_classes;

public abstract class Employee extends Human {
    private String workLocation;

    public abstract void doWork();
    public abstract void introduction();

    public void statusReport() {
        System.out.println("Working!");
    }

    @Override
    public void tellJoke() {
        System.out.println("Why did the can crusher quit his job?\nBecause it was soda pressing.");
    }

    public Employee(String name, int age, String workLocation) {
        super(name, age);
        this.workLocation = workLocation;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }
}
