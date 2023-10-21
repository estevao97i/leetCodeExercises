import java.util.*;


//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        You can return the answer in any order.
//
//
//
//        Example 1:
//
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//        Example 2:
//
//        Input: nums = [3,2,4], target = 6
//        Output: [1,2]
//        Example 3:
//
//        Input: nums = [3,3], target = 6
//        Output: [0,1]

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsValue(complement)) {
                return new int[] {(int) findKey(map, complement).get(), i};
            }
            map.put(i, nums[i]);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] o = {3,3};
        System.out.println(Arrays.toString(Objects.requireNonNull(twoSum(o, 6))));
    }

    public static <K, T> Optional<K> findKey(Map<K, T> mapOrNull, T value) {
        return Optional.ofNullable(mapOrNull).flatMap(map -> map.entrySet()
                .stream()
                .filter(e -> Objects.equals(e.getValue(), value))
                .map(Map.Entry::getKey)
                .findAny());
    }


}
