public class FizzBuzzStringArray {

    public static void main(String[] args) {
        printArray(fizzBuzzStringArray(1, 16));
    }
    
    public static String[] fizzBuzzStringArray(int start, int end) {
        String[] temp = new String[end - start];
        for (int i = 0; i < end - start; i++) {
            String str = "";
            int value = start + i;
            if (value % 3 != 0 && value % 5 != 0) {
                temp[i] = String.valueOf(value);
            } else {
                if (value % 3 == 0) {
                    str += "Fizz";
                }
                if (value % 5 == 0) {
                    str += "Buzz";
                }
                temp[i] = str;
            }
        }
        return temp;
    }

    public static void printArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1] + "]");
    }
      
}
