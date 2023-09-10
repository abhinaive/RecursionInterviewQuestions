package org.recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicRecursionProblems {

    public static void printYourNameNTimes(int i, int noOfTimes){

        if(i > noOfTimes)
            return;

        System.out.printf("Abhinav %d",i);
        System.out.println();

        printYourNameNTimes(i+1,noOfTimes);
    }

    public static void printNTo1NaturalNumbers(int n){

        if(n < 1)
           return;

        System.out.print(n + ", ");
        printNTo1NaturalNumbers(n-1 );

    }

    public static void print1ToNNaturalNumbers(int n){

        if(n < 1)
            return;

        print1ToNNaturalNumbers(n-1 );
        System.out.print(n + ", ");

    }

    public static void printSumOfNNaturalNumbers(int n, int runningSum){

        if(n < 1) {
            System.out.println("Sum of N natural : " + runningSum);
            return;
        }
        runningSum = runningSum + n;
        printSumOfNNaturalNumbers(n-1,runningSum);
    }

    public static void printSumOfNNaturalNumbersParameterisedWay(int n, int runningSum){

        if(n < 1) {
            System.out.println("Sum of N natural : " + runningSum);
            return;
        }
        runningSum = runningSum + n;
        printSumOfNNaturalNumbers(n-1,runningSum);
    }

    public static int printSumOfNNaturalNumbersFunctionalWay(int n){

        if(n < 1) {
            return 0;
        }

       return n + printSumOfNNaturalNumbersFunctionalWay(n-1);
    }

    public static int printFactorialOfNFunctionalWay(int n){

        if(n < 1) {
            return 1;
        }

        return n*printFactorialOfNFunctionalWay(n-1);
    }

    public static void reverseAnArrayUsingRecursion(int leftPtr, int rightPtr, int [] arr){

        if(leftPtr >  rightPtr) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        if(leftPtr < rightPtr){
            int temp = arr[leftPtr];
            arr[leftPtr] = arr[rightPtr];
            arr[rightPtr] = temp;
        }

        reverseAnArrayUsingRecursion(leftPtr + 1, rightPtr - 1 , arr);
    }

    public static boolean checkIfAStringIsPalindromeUsingRecursion(int leftPtr, int rightPtr, String s){

        if(leftPtr >  rightPtr) {
            return true;
        }

        if(s.charAt(leftPtr) != s.charAt(rightPtr)){
            return false;
        }

        return checkIfAStringIsPalindromeUsingRecursion(leftPtr + 1, rightPtr - 1 , s);

    }

    public static int printNthFibonacciNumber(int n){

        if(n <= 1)
            return n;

        return printNthFibonacciNumber(n-1) + printNthFibonacciNumber(n-2);
    }

    public static void printAllSubsequencesOfAnArray(int index, ArrayList<Integer> list, int [] arr) {

        if(index == arr.length){
            System.out.println(list);

            if(list.size() == 0)
               System.out.println("[]");

            return;
        }

        list.add(arr[index]);
        printAllSubsequencesOfAnArray(index + 1, list, arr);
        list.remove(list.size() - 1);
        printAllSubsequencesOfAnArray(index + 1, list, arr);

    }

    public static void printAllSubsequencesOfAString(int index, String str, String output) {

        if(index >= str.length()){
            System.out.println(output);

            if(output.length() == 0)
                System.out.println("[]");

            return ;
        }


        printAllSubsequencesOfAString(index + 1, str, output);

        output = output + str.charAt(index);
        printAllSubsequencesOfAString(index + 1, str, output);

    }

    public static void main(String[] args) {

    //   BasicRecursionProblems.printYourNameNTimes(1,5);
    //   BasicRecursionProblems.printNTo1NaturalNumbers(5);
    //   BasicRecursionProblems.print1ToNNaturalNumbers(5);
    //   BasicRecursionProblems.printSumOfNNaturalNumbersParameterisedWay(10,0);
    //   System.out.println("Sum of N natural : " + BasicRecursionProblems.printSumOfNNaturalNumbersFunctionalWay(10));
    //   System.out.println("Factorial of N  : " + BasicRecursionProblems.printFactorialOfNFunctionalWay(10));
    /*
         int [] arr = {4,3,1,8,10,0};
         System.out.println(Arrays.toString(arr));
         BasicRecursionProblems.reverseAnArrayUsingRecursion(0,arr.length -1 , arr);
    */

    /*
        String s = "abcba";
        boolean isPalindrome = BasicRecursionProblems.checkIfAStringIsPalindromeUsingRecursion(0,s.length() - 1 , s);
        System.out.printf("String : %s is : %b",s,isPalindrome);
    */

    //  System.out.println(BasicRecursionProblems.printNthFibonacciNumber(4));

   /*
        int arr [] = {3,1,2};
        ArrayList<Integer> list = new ArrayList<>();
        printAllSubsequencesOfAnArray(0,list, arr);
   */

        String s = "abc";
        String output = "";
        BasicRecursionProblems.printAllSubsequencesOfAString(0,s,output);

    }

}
