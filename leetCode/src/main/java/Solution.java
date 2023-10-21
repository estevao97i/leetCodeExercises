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

    //** CORRECT ANSWER **//
    public static int firstUniqChar(String s) {
        String[] newString = s.split("");
        int[] vetor = new int[26];

        for (int i = 0; i < newString.length; i++) {
            vetor[newString[i].charAt(0) - 97]++;
        }

        for (int i = 0; i < newString.length; i++) {
            if (vetor[newString[i].charAt(0) - 97] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String value = "hhhhhelp";
        System.out.println(firstUniqChar(value));
    }

}

