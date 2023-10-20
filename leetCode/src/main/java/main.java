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

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(0);
        nums.add(1);
        nums.add(0);
        nums.add(3);
        nums.add(12);

        int zeros = 0;

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == 0) {
                nums.remove(i);
                zeros++;
            }
        }
        for (int i = 0; i < zeros; i++) {
            nums.add(nums.size() , 0);
        }
        System.out.println(nums);
    }
}
