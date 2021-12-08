public class NearHundred {
    public static boolean nearHundred(int n) {
        if ((Math.abs(100 - n) <= Math.abs(10)) || (Math.abs(200 - n) <= Math.abs(10))) {
            return true;
        }
        return false;
    }

    public static void main (String[] args) {
        System.out.println(nearHundred(111));
    }
    
}