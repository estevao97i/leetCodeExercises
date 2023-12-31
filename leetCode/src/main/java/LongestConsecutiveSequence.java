import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        HashSet set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int maxCount = 0;
        for (int i = 0; i < set.size(); i++) {
            if (!set.contains(nums[i] - 1)) {
                int cont = 1;
                while (set.contains(nums[i] + 1)) {
                    cont++;
                    nums[i]++;
                }
                maxCount = Math.max(maxCount, cont);
            }
        }
        return maxCount;
    }


    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 3, 1, 2 ,101, 102, 103, 105, 104};
        System.out.println(longestConsecutive(arr));
    }
}
