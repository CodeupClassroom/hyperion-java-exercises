// Let's have this 'Inheritance' class extend the 'SuperClass'
public class Inheritance extends SuperClass {
    // ## Inheritance

    // ## Extending Classes

    public Inheritance(String name, int ssn) {
        super(name, ssn);
    }

    public void sayName() {
        System.out.println("Hello to you, " + name);
        System.out.println("Hacked ur ssn: " + getSSN());

        System.out.println("Okay for real now, hacked: " + hackTheSSN());
    }
    public static void main(String[] args) {
        // ## Access Modifiers
        Inheritance hacker = new Inheritance("samsepiol", 875456545);
        hacker.sayName();

        // ## The _super_ Keyword


    }

    public int getSSN() {
        return 555555555;
    }

    public int hackTheSSN() {
        return super.getSSN();
    }


    // Polymorphism -- PolymorphismDemo.java
}
