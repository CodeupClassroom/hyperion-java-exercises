package interfaces_abstract_classes;

public abstract class Human implements Being{
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void breath() {
        System.out.println("Air goes in...................... and CO2 goes out.");
    }

    @Override
    public void eat() {
        System.out.println("Food goes in... I'm not telling you what goes out...");
    }
}
