public class ServerNameGenerator {
    // Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
    public String[] nouns = {"soccerball", "meteor", "monitor", "grass", "atmosphere", "space", "instructor", "student", "codeup", "planet"};
    public String[] adjectives = {"majestic", "purple", "horrifying", "gracious", "happy", "jovial", "crunchy", "smooth", "digital", "hidef"};

    // Create a method that will return a random element from an array of strings.
    public static String randomWord(String[] inputWords) {
        int randomNum = (int)(Math.random() * inputWords.length);
        return inputWords[randomNum];
    }

    // Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
    public static void main(String[] args) {
        System.out.println("Here is your server name:");
        ServerNameGenerator sng = new ServerNameGenerator();
        System.out.println(randomWord(sng.adjectives) + "-" + randomWord(sng.nouns));
    }
}
