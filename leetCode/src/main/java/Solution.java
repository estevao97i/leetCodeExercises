//  Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//        Note that you must do this in-place without making a copy of the array.
//
//        Example 1:
//        Input: nums = [0,1,0,3,12]
//        Output: [1,3,12,0,0]
//
//        Example 2:
//        Input: nums = [0]
//        Output: [0]

class Solution {
    public static int[] moveZeroes(int[] nums) {
        int lastZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[lastZero];
                nums[lastZero] = nums[i];
                nums[i] = temp;
                lastZero++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int[] res = moveZeroes(nums);
        System.out.println(res[0]);
    }

}

