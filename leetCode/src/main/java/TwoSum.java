import java.util.*;

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
