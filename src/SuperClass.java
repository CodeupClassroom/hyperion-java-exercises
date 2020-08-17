public class SuperClass {
    // Create a String property 'name' that will store a name
    protected String name; // still available to subclasses
    private int socialSecurityNumber; // only available here

    // **during access modifiers**, create a private int 'socialSecurityNumber'

    public SuperClass(String name, int socialSecurityNumber) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
    }


    // **during access modifiers** write a Getter for the socialSecurityNumber (
    public int getSSN() {
        return socialSecurityNumber;
    }
}
