public class CohortStudent {
    private String name = "Casey";
    public final double gpa = 85.2;
    private int zipCode = 60652;

    @Override
    public String toString() {
        return "CohortStudent{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                ", zipCode=" + zipCode +
                '}';
    }
}
