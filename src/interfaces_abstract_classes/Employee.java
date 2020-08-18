package interfaces_abstract_classes;

public abstract class Employee extends Human {


    private String workLocation;

    public abstract void doWork();
    public abstract void introduction();
    public void statusReport() {
        System.out.println("Working!");
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
