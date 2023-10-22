package org.recursion;

import java.util.Arrays;

public class PrintAllPermutationsOfString {

    private static boolean MatchFound = false;

    /*  Time Complexity : n*(n-1)(n-2)....1 = O(n!) */
    public static void printAllPermutationsOfString(String str, String permutation){

        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);

            printAllPermutationsOfString(newStr, permutation + currChar);
        }
    }

    public static void checkIf2GivenStringsPermutationsOfEachOtherUsingRecursion(String str1,String str2, String permutation){

        if(str1.length() == 0){

            System.out.println("Permutation : "+ permutation);

            if(permutation.equals(str2)) {
                System.out.println("Match Found : " + permutation);
                MatchFound = true;
                return;
            }
        }

        if(MatchFound == true)
            return;

        for(int i = 0; i < str1.length(); i++){
            char currChar = str1.charAt(i);
            String newStr = str1.substring(0, i) + str1.substring(i+1);

            checkIf2GivenStringsPermutationsOfEachOtherUsingRecursion(newStr, str2 ,permutation + currChar);
        }

    }

    public static String sortAString(String n){

        char [] content = n.toCharArray();
        Arrays.sort(content);

        return new String(content);
    }

    public static boolean checkIf2GivenStringsPermutationsOfEachOtherUsingSortMethod(String s, String t){

        if(s.length() != t.length())
            return false;

        return sortAString(s).equals(sortAString(t));
    }

    public static boolean checkIf2GivenStringsPermutationsOfEachOtherUsingIdenticalCharacterCount(String s, String t){

        if(s.length() != t.length())
            return false;

        int letters[] = new int[128];

        char[] sToArray = s.toCharArray();

        for(char c : sToArray){
            letters[c]++;  /* value at letters[c = 'A' = 65] = letters[65] = 1 */
        }

        for(int i = 0 ; i < t.length() ; i++){
            int z = (int)t.charAt(i);
            letters[z]--;

            if(letters[z] < 0) {
                System.out.println(Arrays.toString(letters));
                return false;
            }
        }

        System.out.println(Arrays.toString(letters));
        return true;
    }




    public static void main(String[] args) {
         String str = "abcd";
//       printAllPermutationsOfString(str,"");

         checkIf2GivenStringsPermutationsOfEachOtherUsingRecursion(str,"dabc","");

         String s = "abcd";
         String t = "dcba";

         System.out.println("Are Given Strings Permutations 1 ? : "+ checkIf2GivenStringsPermutationsOfEachOtherUsingSortMethod(s,t));

         System.out.println("Are Given Strings Permutations 2 ? : "+ checkIf2GivenStringsPermutationsOfEachOtherUsingIdenticalCharacterCount(s,t));

    }

}
