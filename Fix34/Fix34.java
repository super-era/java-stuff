import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fix34 {
    public static void main (String[] args) {
        int[] nums = {3, 2, 3, 2, 4, 4};
        System.out.println(Arrays.toString(fix34(nums)));
    }

    // static methods
    public static int[] fix34(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : nums) {
            list.add(i);
        }
        List<Integer> result = new ArrayList<Integer>();

        int count = 0;
        int count4 = 0;

        for (int i = 0; i < list.size(); i++) {
            System.out.println("i = " + i);
            System.out.println("--------------------------");
            if ((list.get(i) != 4) && (list.get(i) != 3)) {
                if (i + 1 <= list.size() - 1) {
                    if (list.get(i + 1) == 3) {
                        continue;
                    }
                    else if (list.get(i + 1) != 3) {
                        if (result.contains(0)) {
                            result.set(result.indexOf(0), list.get(i));
                            list.remove(i);
                            i--;
                        } else {
                            System.out.println("list.get(i) = " + list.get(i));
                            result.add(list.get(i));
                            list.remove(i);
                            i--;
                            count++;
                        }
                        System.out.println(count +  " = " + Arrays.toString(result.stream().mapToInt(x -> x).toArray()));
                        System.out.println(Arrays.toString(list.stream().mapToInt(x -> x).toArray()));
                    }
                }    
            }
            else if (list.get(i) == 3) {
                System.out.println("list.get(i) = " + list.get(i));
                list.remove(i);
                i--;
                result.add(3);
                result.add(4);
                count4++;
                count++;
                System.out.println(count +  " == " + Arrays.toString(result.stream().mapToInt(x -> x).toArray()));
                System.out.println(Arrays.toString(list.stream().mapToInt(x -> x).toArray()));
            }
            else if (list.get(i) == 4) {
                System.out.println("list.get(i) = " + list.get(i));
                list.remove(i);
                i--;
                if (i + 1 <= list.size() - 1) {
                    if ((count4 != 0) && (list.get(i + 1) == 3) && (list.get(i - 1) != 4)) {
                        result.add(0);
                        count4--;
                    }
                }
                count++;
                System.out.println(count +  " === " + Arrays.toString(result.stream().mapToInt(x -> x).toArray()));
                System.out.println(Arrays.toString(list.stream().mapToInt(x -> x).toArray()));
            }

        }

        while (list.size() != 0) {
            result.add(list.get(0));
            list.remove(0);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

}