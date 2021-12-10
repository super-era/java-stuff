public class FizzArray {
  public static void main(String[] args) {
    int n = 8;
    System.out.println(fizzArray(n));
  }

  public static int[] fizzArray(int n) {
    int[] temp = new int[n];
    for (int i = 0; i < n; i++) {
      temp[i] = i;
    }
    return temp;
  }
}
