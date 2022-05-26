package day1;

public class SearchInsertPosition {
    public static void main(String[] args) {
        //Mảng sắp xếp từ bé đến lớn -> đưa ra vị trí của target nếu có, không thì lấy vị trí của  target(lúc chén vào mảng theo thứ tự)
        int [] nums = new int[]{ 1 ,3 , 6, 7, 9,  11, 21 };
        int target = 5;
        int result = searchInsert(nums, target);
    }
    //So sánh mid của mảng, điều chỉnh để mid gần với target
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int lower = 0;
        int higher = n - 1;
        int index;
        while (higher >= lower) {
            index = (higher + lower) / 2;
            if (nums[index] == target)
                return index;
            else if (target > nums[index]) {
                lower = index + 1;
            } else
                higher = index - 1;
        }

        return lower;

    }
}
