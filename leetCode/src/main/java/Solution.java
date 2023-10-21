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

        // cria vetor com 26 espaços em memoria no valor de zeros
        int[] vetor = new int[26];

        // coloca dentro do array de acordo com a tabela ASCII
        for (int i = 0; i < newString.length; i++) {
            vetor[newString[i].charAt(0) - 97]++;
        }

        // verifica quantas ocorrencias são apenas 1 e retorna a posicao
        for (int i = 0; i < newString.length; i++) {
            if (vetor[newString[i].charAt(0) - 97] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String value = "loveleetcode";
        System.out.println(firstUniqChar(value));
    }

}

