package com.donatasd.grid;

/**
 * Created by Donatas Daubaras.
 */
public class GridUtils {

    /**
     * Checks what color should the grid field be. 0 indicates white and 1 indicates black
     *
     * @param x - column number in range [1,n]
     * @param y - row number in range [1,n]
     * @return 0 if white and 1 if black
     */
    public int getColor(int x, int y) {
        return (y^x)&1;
    }
}
