package org.recursion;

public class MergeSort {

    public static void mergeSortDivideData(int [] data, int start, int end){
        if(start < end){
            int mid = (start + end)/2;
            mergeSortDivideData(data,start,mid);
            mergeSortDivideData(data,mid +1 ,end);

            mergeSortedData(data,start, mid, end);
        }
    }

    public static void mergeSortedData(int [] data, int start, int mid, int end){
        int [] temp = new int[end - start + 1];   // If we don't want to modify original array for sub arrays

        int i = start, j = mid + 1, k = 0;  // K is a tracker variable that keeps track of the values we put in temp array

        while(i <= mid && j <= end){ // While both left and right sub arrays have values, then try and merge them in sorted order
            if(data[i] < data[j]){
                temp[k] = data[i];
                i++;
                k++;
            }else{
                temp[k] = data[j];
                i++;
                j++;
            }
        }


        while(i <= mid){ // if right sub-half exhausted then rest of values from left sub array into result
            temp[k] = data[i];
            k++;
            i++;
        }

        while(j <= end){ // if left sub-half exhausted then rest of values from right sub array into result
            temp[k] = data[j];
            k++;
            j++;
        }

        for(i = start; i <= end; i++) {  // to copy the data into original array from temp
           data[i] = temp[i - start];
        }
    }

    public static void main(String[] args) {

        int [] data = new int[]{-5,20,10,3,2,0,};
        mergeSortDivideData(data,0,data.length-1);

    //    for(int m = 0; m < data.length; m++){
    //        System.out.print(data[m] + ", ");
    //    }

    }


}
