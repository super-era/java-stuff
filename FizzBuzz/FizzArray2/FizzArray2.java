public class FizzArray2 {
  public static void main(String[] args) {
    int n = 8;
    System.out.println(fizzArray2(n));
  }

  public static String[] fizzArray2(int n) {
    String[] temp = new String[n];
    for (int i = 0; i < n; i++) {
      temp[i] = String.valueOf(i);
    }
    return temp;
  }
}
