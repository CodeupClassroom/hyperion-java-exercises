package interfaces_abstract_classes;

public class ProductManager extends Employee {
    public ProductManager(String name, int age, String workLocation) {
        super(name, age, workLocation);
    }

    @Override
    public void doWork() {
        System.out.println("Keep it going! We're working toward a finished product that'll make a lot of folks happy! I'll be in my office.");
    }

    @Override
    public void introduction() {
        System.out.format("Hello! I'm %s, and I am a Product Manager out of %s. Shouldn't you be getting back to work?%n", this.getName(), this.getWorkLocation());
    }

    public void performanceReview() {
        System.out.println("We've got to work on your output.");
    }

    public static void main(String[] args) {
        Employee tom = new ProductManager("Tom Hansen", 51, "San Francisco, CA");
        tom.introduction();
        tom.doWork();
        tom.tellJoke();
        tom.breathe();
//        tom.performanceReview();
    }
}
