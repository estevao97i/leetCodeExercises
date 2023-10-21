//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

//        Example 1:
//        Input: s = "leetcode"
//        Output: 0

//        Example 2:
//        Input: s = "loveleetcode"
//        Output: 2

//        Example 3:
//        Input: s = "aabb"
//        Output: -1


class FirstUniqChar {

    //** GENIUS ANSWER **//
    public static int firstUniqChar(String s) {
        // define o index
        int index = -1;

        // itera pelo string transformando em char
        for(char ch : s.toCharArray()) {
            // verifica se o index do elemento em questão é o mesmo index do ultimo elemento em questão (genio viu)
            if(s.indexOf(ch) == s.lastIndexOf(ch)) {
                // retorna se forem o mesmo elemento
                return s.indexOf(ch);
            }
        }
        return index;
    }

    public static void main(String[] args) {
        String value = "loveleetcode";
        System.out.println(firstUniqChar(value));
    }

}

