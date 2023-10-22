package org.recursion;

import java.util.ArrayList;

public class CountTotalPathInMazeToReachFromOriginToMCommaN {

    public static int countTotalPathToReachFromOriginToMCommaN(int m, int n){

        if(m == 1 || n == 1)  // There is only one way to reach (1,0) (2,0)...(m,0) | (0,1) (0,2)...(0,n) from origin
            return 1;

        int NumberOfWaysToReachFromCellAboveIt = countTotalPathToReachFromOriginToMCommaN(m, n-1);

        int NumberOfWaysToReachFromCellLeftOfIt = countTotalPathToReachFromOriginToMCommaN(m-1, n);

        return NumberOfWaysToReachFromCellLeftOfIt + NumberOfWaysToReachFromCellAboveIt;  // Total number of ways to reach a cell
    }

    public static int countTotalPathToReachFromOriginToMCommaNOptimized(int m, int n){

        ArrayList<Integer> list = new ArrayList<>(m);

        for (int k = 0; k < m; k++) {
            list.add(1);
        }

        for(int i = 0; i < n-1; i++){

            for(int j=1; j<m; j++){    // Cumulative addition kroge per row for n times to get final last row
                list.set(j,list.get(j) + list.get(j-1));
            }
        }

        return list.get(m-1);
    }

    /*
    public static int countTotalPathToReachFromOriginToMCommaNOptimized(int m, int n){

        ArrayList<Integer> list = new ArrayList<>(n);

        for (int k = 0; k < m; k++) {
            list.add(1);
        }

        for(int i = 0; i < m-1; i++){

            for(int j=1; j<n; j++){
                list.set(j,list.get(j) + list.get(j-1));
            }
        }

        return list.get(n-1);
    }
    */

    public static void main(String[] args) {

        int m = 5, n = 4;
        int TotalNumberOfPossiblePaths =  countTotalPathToReachFromOriginToMCommaN(m,n);
        System.out.println("TotalNumberOfPossiblePaths : " + TotalNumberOfPossiblePaths);

        int TotalNumberOfPossiblePathsOptimized =  countTotalPathToReachFromOriginToMCommaNOptimized(m,n);
        System.out.println("TotalNumberOfPossiblePathsOptimized : " + TotalNumberOfPossiblePathsOptimized);

    }
}
