package org.recursion;

public class NumberOfWaysToPlace1xMTileOnNxMFloor {

    public static int findNumberOfWaysToPlace1xMTileOnNxMFloor(int  n, int m){

        if(n == m)    /* There are only 2 ways to fill the entire floor all horizontal or all vertical */
            return 2;

        if(n < m)
            return 1;

        int verticalPlacements = findNumberOfWaysToPlace1xMTileOnNxMFloor(n-m, m);

        int horizontalPlacements = findNumberOfWaysToPlace1xMTileOnNxMFloor(n-1,m);

        return verticalPlacements + horizontalPlacements;
    }

    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println("NumberOfWaysToPlace1xMTileOnNxMFloor : " + findNumberOfWaysToPlace1xMTileOnNxMFloor(n,m));
    }

}
