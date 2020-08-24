package annotations;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Child extends Parent{

    @Override
    public void sayHello() {
        System.out.println("Hello from child class!");
    }

    /*********** DEPRECATED WITH NO COMMENT FOR DEVELOPERS ***********/
    @Deprecated
    public void deprecatedNoComment(){
        System.out.println("I'm deprecated with no help for developers!");
    }

    /**
     * @deprecated Use newMethod instead {@link #imAMethod()}
     */
    @Deprecated
    public void deprecatedMethod(){
        System.out.println("I'm a deprecated method!");
    }

    /**
     * NEW METHOD THAT REPLACES THE DEPRECATED ONE (deprecatedMethod)
     */
    public void imAMethod(){
        System.out.println("I'm a method!");
    }

    /* Method with @Optional annotation */
    @Parameters("name")
    public static void sayHelloToName(@Optional("buddy") String name) {
        System.out.println("Hello, " + name);
    }

}