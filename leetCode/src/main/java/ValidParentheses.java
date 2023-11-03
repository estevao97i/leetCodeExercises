import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class ValidParentheses {

    public static boolean isValid(String s) {
        HashMap<Character, String> mapEntry = new HashMap<>();
        mapEntry.put('[', "]");
        mapEntry.put('{', "}");
        mapEntry.put('(', ")");

        HashMap<Character, String> mapOut = new HashMap<>();
        mapOut.put(']', "[");
        mapOut.put(')', "(");
        mapOut.put('}', "{");

        List<String> stack = new ArrayList<>();

        for (char word : s.toCharArray()) {
            if (mapEntry.get(word) != null) {
                System.out.println(mapEntry.get(word));
                System.out.println();
                System.out.println(word);
                stack.add(String.valueOf(word));
            } else if (!stack.isEmpty() && Objects.equals(mapOut.get(word), stack.get(stack.size() - 1))) {
                stack.remove(stack.size() - 1);
            } else {
                return false;
            }
        }
        return stack.size() == 0;
    }

    public static void main(String[] args) {
        String str = "[[]]";
        System.out.println(isValid(str));
    }
}
