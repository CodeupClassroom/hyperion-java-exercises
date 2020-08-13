import oop.Dog;

public class DavidVisibilityExample {
    // Here is am outside of the oop package, and here in the src directory for our Java files. Notice when Dog's fields are set to public what I can do.
    public static void main(String[] args) {
        Dog dog = new Dog("Peridot", 'F', 19);
        dog.setName("Doug Bowser, President of Nintendo of America");
//        dog.gender = 'M';
        dog.setWeightInKG(89);
//        dog.breed = "Human";

//        System.out.println(dog.breed);
        System.out.println(dog.getName());
        System.out.println(dog.getWeightInKG());
        // Notice how I am able to access and reassign values to the object all willy-nilly? What if I wanted to add a layer of protection to the values of the objects?
        // I can change the visibility of the different fields!

        // What happun?

        // What if I want the ability to change the values of the different fields of the object, but don't want it allowed with out some level of abstraction?
        // -- David, go back to Dog.java --
    }
}
