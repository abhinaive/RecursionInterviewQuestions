package org.recursion;

public class CheckPalindrome {

    public static boolean checkIfPalindromeUsingRecursion(String str){

        if((str.length() == 0) || (str.length() == 1))   // Since string of size 0,1 are already a palindrome
          return true;

        if(str.charAt(0) == str.charAt(str.length() - 1))
            return checkIfPalindromeUsingRecursion(str.substring(1,str.length()-1));


        return false;    // Handle another base case : if at any point the characters does't match at opposite indices
    }

    public static void main(String[] args) {

        System.out.println(CheckPalindrome.checkIfPalindromeUsingRecursion("MADAM"));

    }
}
