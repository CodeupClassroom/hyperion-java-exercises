package oop;

public class Dog {
    public char gender;
    public int weightInKG;
    // Notice that I haven't defined a value for these variables. Why do you think I might have done that?

    public String name = "No Name";
    public String breed = "Unknown/Mixed Breed";
    // I can give these values a default/starting value by assigning a value. These values can be overwritten. Why?

    public static void bark() {
        System.out.println("Bark bark!");
    }
    // What keyword was added to this method?

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Peridot";
        dog.gender = 'F';
        dog.weightInKG = 19;
        dog.breed = "American Staffordshire Terrier Mix";

        System.out.println(dog);
        System.out.println(dog.name);
        dog.bark();
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
    // Let's create a constructor method! We lack one for a a dog with known name, gender, weightInKG, and breed.

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

}