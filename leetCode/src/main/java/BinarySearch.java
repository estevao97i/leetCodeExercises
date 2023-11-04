import java.util.Arrays;

public class BinarySearch {

    public static int search(int[] nums, int target) {
        int inicio = 0;
        int fim = nums.length - 1;
        int meio;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (nums[meio] == target) {
                return meio;
            } else if (nums[meio] < target) {
                inicio = meio + 1;
            } else {
                fim = meio -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        System.out.println(search(nums, 0));
    }
}
