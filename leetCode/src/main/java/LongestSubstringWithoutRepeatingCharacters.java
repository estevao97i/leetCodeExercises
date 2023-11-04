import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

    // GENIAL
    public static int lengthOfLongestSubstring(String s) {
        HashMap map = new HashMap<>();
        int left = 0;
        int right = 0;

        int maxSize = 0;
        while (right < s.length()) {
            if (!map.containsKey(s.charAt(right))) {
                map.put(s.charAt(right), 1);
                right++;
                maxSize = Math.max(maxSize, map.size());
            } else {
                map.remove(s.charAt(left));
                left++;
            }
        }
        return maxSize;
    }

    public static void main(String[] args) {
        String str = "abcabcaaaabbbcdefg";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
