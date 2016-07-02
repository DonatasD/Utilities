package com.donatasd.utils;

/**
 * Provides various functions for n x n grid (matrix).
 *
 * @author Donatas Daubaras
 */
public class GridUtils {

    /**
     * Checks what color should the grid field be. 0 indicates white and 1 indicates black
     *
     * @param x - column number in range [1,n]
     * @param y - row number in range [1,n]
     * @return 0 if white and 1 if black
     */
    public static int getColor(int x, int y) {
        return (y^x)&1;
    }

    /**
     * Calculates the sum of spiral's diagonals. I.E:
     * 1) 5 4 3     2) 4 3
     *    6 1 2        1 2
     *    7 8 9
     *  Example 1)n=3 Sum = 25    Example 2)n=2 Sum = 10
     *
     * @param n - dimention spiral
     * @return Sum of diagonals
     */
    public static double spiralDiagonalSum(int n) {
        //TODO Check why Fails to work with 6 digit numbers (works in python)
        if (n % 2 == 1) {
            int x = (n - 1) / 2;
            return (16 * Math.pow(x, 3) + 30 * Math.pow(x, 2) + 26 * x + 3) / 3;
        }
        int x = n / 2 - 1;
        return (16 * Math.pow(x, 3) + 54 * Math.pow(x, 2) + 68 * x + 30) / 3;
    }
}
