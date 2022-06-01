package day3;

public class E1 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 0, 6, 0, 6, 0};
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
}
