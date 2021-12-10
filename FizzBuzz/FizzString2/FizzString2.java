public class FizzString2 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fizzString2(n));
    }

    public static String fizzString2(int n) {
        String str = "";
        if ((n % 3 != 0) && (n % 5 != 0)) {
          str += n;
        } else {
          if (n % 3 == 0) {
            str += "Fizz";
          }
          if (n % 5 == 0) {
            str += "Buzz";
          }
        }
        return str + "!";
      }
}
