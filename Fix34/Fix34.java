public class Fix34 {
    public static void main (String[] args) {
        int[] nums = {1, 3, 1, 4};
        System.out.println(fix34(nums));
    }

    // static methods
    public static int[] fix34(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                if (nums[i + 1] != 4) {
                    for (int j = 0; j < nums.length; i++) {
                        if (nums[j] == 4) {
                            int k = j - 1;      // index before 4 is j - 1
                            System.out.println("nums[k] = " + nums[k]);
                            while (nums[k] != 3) {
                                nums[k + 1] = nums[k];
                                System.out.println("nums[k + 1] = " + nums[k + 1]);
                                k--;
                            }
                            nums[i + 1] = nums[j];
                            System.out.println("[");
                            for (int m = 0; m < nums.length - 1; m++) {
                                System.out.println(nums[m] + ", ");
                            }
                            System.out.println(nums[nums.length - 1] + "]");
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return nums;
    }
    

}