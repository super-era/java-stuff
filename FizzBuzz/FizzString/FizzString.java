public class FizzString {
    public static String fizzString(String str) {
        if (str.startsWith("f") && !str.endsWith("b")) {
            return "Fizz";
        } else if (!str.startsWith("f") && str.endsWith("b")) {
            return "Buzz";
        } else if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        } else {
            return str;
        }
    }

    public static void main(String[] args) {
        String str = "fooob";
        System.out.println(fizzString(str));
    }
}