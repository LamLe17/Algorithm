package day2;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int [] nums = {-5, -4, -3, -1, 2, 3, 5, 6};
        int[] result = new int[nums.length];
        result = sortedSquares(nums);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
        System.out.println(result[3]);
        System.out.println(result[4]);
        System.out.println(result[5]);
        System.out.println(result[6]);
        System.out.println(result[7]);
    }
    public static int[] sortedSquares(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        int pointOne = 0, pointTwo = length - 1;
        for (int n = length - 1; n >= 0; n--) {
            if (nums[pointOne]*nums[pointOne] > nums[pointTwo]*nums[pointTwo]) {
                result[n] = nums[pointOne] * nums[pointOne];
                pointOne++;
            } else {
                result[n] = nums[pointTwo] * nums[pointTwo];
                pointTwo--;
            }
        }
        return result;
    }
}
