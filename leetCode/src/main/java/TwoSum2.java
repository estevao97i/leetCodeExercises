import java.util.Arrays;

public class TwoSum2 {

    public static int[] twoSum(int[] numbers, int target) {
        int ult = numbers.length - 1;
        int ini = 0;
        for (int i = 0; i < numbers.length; i++) {
            int sum = numbers[ini] + numbers[ult];
            if (sum == target)  return new int[] {ini + 1, ult + 1};
            if (sum > target) ult--;
            if (sum < target) ini++;
            }
            return new int[] {};
        }

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(numbers, 26)));
    }
}
