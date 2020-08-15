public class Instructor {
    // Create an instructor class, so that we can use it for Array
    //  manipulation in our 'ArraysLec' class
    private String firstName;
    private String lastName;
    private int brainWaveFrequency;
    private static int numInstructors = 0;

    public Instructor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.brainWaveFrequency = 0;
        numInstructors++;

        System.out.printf("%s was just created!\n", firstName);
        System.out.printf("Instructor count: %d\n\n", numInstructors);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBrainWaveFrequency() {
        return brainWaveFrequency;
    }

    public void setBrainWaveFrequency(int brainWaveFrequency) {
        this.brainWaveFrequency = brainWaveFrequency;
    }

    public String displayStats() {
        return String.format("%s %s, Brainwave Frequency: %d", firstName, lastName, brainWaveFrequency);
    }
}
