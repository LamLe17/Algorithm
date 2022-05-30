package day2;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        rotate(nums, k);
    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int [] numsCopy = Arrays.copyOf(nums, n);
//        numsCopy = nums;
        for(int i=0; i<n; i++){
            if(i<k){
                nums[i] = numsCopy[n-k+i];
            } else {
                nums[i] = numsCopy[i-k];
            }
        }
    }
}
