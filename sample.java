public class Sample {
    public static void main(String[] args) {
        String userName = "John";
        System.out.println(greetUser(userName));
        System.out.println(greetUser(unknownVariable)); // This line introduces an error
    }

    public static String greetUser(String name) {
        return "Hello, " + name + "!";
    }
}