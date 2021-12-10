public class FizzArray3 {
  public static void main(String[] args) {
    System.out.println(fizzArray3(8, 15));
  }

  public static int[] fizzArray3(int start, int end) {
    int[] temp = new int[end - start];
    for (int i = 0; i < end - start; i++) {
      temp[i] = start + i;
    }
    return temp;
  }
}
