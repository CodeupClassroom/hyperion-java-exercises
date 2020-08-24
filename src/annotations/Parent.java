package annotations;

public class Parent {
    public void sayHello(){
        System.out.println("Hello from parent class!");
    }


    /**
     * @deprecated Use newMethod instead {@link #newMethod()}
     */
    @Deprecated
    public static void oldMethod() {
        System.out.println("Old way of doing things...");
    }

    /* Tons of other code */

    /* ... */


    public static void newMethod() {
        System.out.println("New way of doing things...");
    }

}