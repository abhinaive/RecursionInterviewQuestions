package org.recursion;

public class RecursiveBinarySearch {

    public static  int recursiveBinarySearchImplementation(int [] arr, int left, int right, int element){
        if(left > right)
            return -1;

        int mid = (left + right)/2;

        if(arr[mid] == element)
            return mid;

        if(element < arr[mid] )
          return recursiveBinarySearchImplementation(arr,left,mid - 1 , element);


        return recursiveBinarySearchImplementation(arr,mid+1 ,right, element);    // else : arr[mid] > element

    }

    public static void main(String[] args) {

        int [] arr = {1,2,3,5,6,7,9,10,20};  // Array must be sorted

        System.out.println(RecursiveBinarySearch.recursiveBinarySearchImplementation(arr,0,arr.length-1,10));

    }
}
