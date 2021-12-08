public class PosNeg {
    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            if (a < 0 && b < 0) {
                return true;
            }
        } else {      // if negative == false
            if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
                return true;
            }
        }
        return false;
    }

    public static void main (String[] args) {
        System.out.println(posNeg(-4, 5, true));
    }
      
}
