package annotations;

import java.util.ArrayList;
import java.util.List;

public class AnnotationsLecture {
    public static int someNum = 3;

    public static void main(String[] args) {



        Child child1 = new Child();

        //TODO TOGETHER: Call deprecated method & no comment
        child1.deprecatedNoComment();

        //TODO TOGETHER: Call deprecated method with comment
        child1.deprecatedMethod();



        //TODO TOGETHER:Call sayHello without @Override
        child1.sayHello();


        //TODO TOGETHER: Comment out annotation and change Parent sayHello to sayHelloParent
        Parent parent1 = new Parent();
        Parent.oldMethod();

    }

    //TODO Together: explore analyze > inspect code
    //TODO Together: Use @SuppressWarnings
   @SuppressWarnings("deprecated static")
   // @SuppressWarnings("all")
    public static void doRiskyThings(){
        Child riskyChild = new Child();
        riskyChild.oldMethod(); //static access & deprecation

        int a = (int) 2;
        List l = new ArrayList(); // raw use warning
        l.add("test"); // unchecked warning
        int three = 3; // unused warning

        System.out.println(l);
        AnnotationsLecture al = new AnnotationsLecture(); // Instantiation of utility class
        System.out.println(al.someNum); // static-access warning

        String someName = "Fred"; // unused


        // Notice these warnings are still present!
        if (true) {
            ;
        }

        Boolean test = true; //assigning a primitive type to a reference type variable
        if (test) {
            System.out.println("TRUE!");
        }
    }

}

