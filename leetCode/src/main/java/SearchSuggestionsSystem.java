import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchSuggestionsSystem {

    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> res = new ArrayList<>();
        List<String> nameProduct = new ArrayList<>();
        for (String product : products) {
            nameProduct.add(product.toLowerCase());
        }

        List<String> sortedWords = nameProduct.stream().sorted().collect(Collectors.toList());

        for (int i = 1; i <= searchWord.length(); i++) {
            List<String> resultWords = new ArrayList<>();
            String sub = searchWord.substring(0, i);
            for (String s : sortedWords) {
                if (resultWords.size() < 3) {
                    if (s.startsWith(sub)) {
                        resultWords.add(s);
                    }
                }
            }
            res.add(resultWords);
        }

        return res;
    }

    public static void main(String[] args) {
//        String[] products = {"mobile", "mouse", "moneypot", "monitor", "mousepad"};
        String[] products = {"havana"};
        System.out.println(suggestedProducts(products, "havana"));
    }
}
