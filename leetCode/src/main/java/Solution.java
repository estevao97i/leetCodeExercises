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


import java.util.Objects;

class Solution {

    //** WRONG ANSWER **//
    public static int firstUniqChar(String s) {
        String[] newWord = s.split("");
        int letterPointer = 0;
        for (int i = 1; i < newWord.length; i++) {
            if (Objects.equals(newWord[i], newWord[letterPointer])) {
                letterPointer++;
                i = letterPointer + 1;
            }
        }
        if (letterPointer == newWord.length) {
            return -1;
        }
        return letterPointer;
    }

    public static void main(String[] args) {
        String value = "aabb";
        System.out.println(firstUniqChar(value));
    }

}

