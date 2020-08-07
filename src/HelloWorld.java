public class HelloWorld {
    public static void main(String[] args) {
       int myFavoriteNumber = 17;
       System.out.println(myFavoriteNumber);

       String myString = "I was hungry from my lecture, so I ordered Tiff's Treats for me and my fiance.";
//       myString = 'g';
//       myString = 3.14159;
       System.out.println(myString);

       float myNumber = (float) 3.14;
       System.out.println(myNumber);

        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        int y = 5;
        System.out.println(++y);
        System.out.println(y);

//        String class = "Hyperion";

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

        int k = 4;
        k += 5;
        System.out.println(k);

        x = 3;
        y = 4;
        y *= x;
        System.out.println(y);

        x = 10;
        y = 2;
        x /= y;
        y -= x;

        System.out.println(x);
        System.out.println(y);

        int coolExample = Integer.MAX_VALUE + 1;
        System.out.println(coolExample);

    }
}
