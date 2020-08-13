package oop;

public class Dog {
    private char gender;
    private int weightInKG;
    // Notice that I haven't defined a value for these variables. Why do you think I might have done that?

    private String name = "No Name";
    private String breed = "Unknown/Mixed Breed";
    // I can give these values a default/starting value by assigning a value. These values can be overwritten. Why?

    static void bark() {
        System.out.println("Bark bark!");
    }
    // What keyword was added to this method?

    public static void main(String[] args) {
        Dog peri = new Dog("Peridot", 'F', 19, "American Staffordshire Terrier Mix");
//        peri.name = "Peridot";
//        peri.gender = 'F';
//        peri.weightInKG = 19;
//        peri.breed = "American Staffordshire Terrier Mix";

        System.out.println(peri);
        System.out.println(peri.name);
        peri.bark();
        Dog.bark();


        // Notice how that was super inconvenient?
        // How might we make it easier?
    }

    public Dog(char gender, int weightInKG, String breed) {
        this.gender = gender;
        this.weightInKG = weightInKG;
        this.breed = breed;
    }

    public Dog(char gender, int weightInKG) {
        this.gender = gender;
        this.weightInKG = weightInKG;
    }

    public Dog(String name, char gender, int weightInKG) {
        this.name = name;
        this.gender = gender;
        this.weightInKG = weightInKG;
    }

    // We have defined multiple constructor methods here, so let's see how the were made.
    // Let's create a constructor method! We lack one for a dog with known name, gender, weightInKG, and breed.

    public Dog(String name, char gender, int weightInKG, String breed) {
        this.name = name;
        this.gender = gender;
        this.weightInKG = weightInKG;
        this.breed = breed;
    }

    // Look at what's back!

    public Dog() {
    }
    // What's up with this constructor?

    // Now let's pause for a second. How easy is it to change the name of a dog? We can certainly see how changing the name of a dog would require training, and training requires some sort of... methodology...

    // Let's talk about visibility for a moment...
    // So far we've used methods and fields with public visibility. What's the advantage of this visibility you may ask?

    // We have the ability to create getters and setters!


    public String getName() {
        return name;
    }

    // getters will retrieve the value assigned to a field.

    public void setName(String name) {
        this.name = name;
    }

    // setters will assign the value passed through to the field.

    // Let's build some more!

    // getter for the weightInKG property
    public int getWeightInKG() {
        return weightInKG;
    }

    // setter for weightInKG
    public void setWeightInKG(int weightInKG) {
        this.weightInKG = weightInKG;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "gender=" + gender +
                ", weightInKG=" + weightInKG +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }


}