package com.donatasd.utils;

import java.util.Arrays;

/**
 * Provides various functions to deal with string manipulations and various string checks.
 *
 * @author Donatas Daubaras
 */
public class StringUtils {
    /**
     * Check if provided strings are permutations. Permutations are strings that contain same characters in same or
     * different order
     *
     * @param arg1 - first string
     * @param arg2 - second string
     * @return boolean indicating whether arg1 and arg2 are permutations.
     */
    public static boolean isStringPermutation(String arg1, String arg2) {
        if (arg1.length() != arg2.length()) {
            return false;
        }
        char[] charArg1 = arg1.toCharArray();
        char[] charArg2 = arg2.toCharArray();
        Arrays.sort(charArg1);
        Arrays.sort(charArg2);
        return Arrays.equals(charArg1, charArg2);
    }

    /**
     * Swap start characters with end characters I.E:
     * swapCharacter("abcde") = "edcba"
     *
     * @param arg - String to swap
     * @return swapped String
     */
    public static String swapCharacters(String arg) {
        char[] charArg = arg.toCharArray();
        int len = charArg.length;
        int n = len / 2;
        for (int i=0; i < n; i++) {
            char swap = charArg[i];
            charArg[i] = charArg[len - i - 1];
            charArg[len - i - 1] = swap;
        }
        return new String(charArg);
    }

    /**
     * Rotates provided String by provided number of positions. If number of positions is positive String will be
     * rotated clockwise. If number of positions is negative then String will be rotated counterclockwise. If number
     * of positions is 0 then provided String will be returned.
     *
     * @since 1.8
     * @param str - String that is going to be rotated
     * @param nPos - number of positions to rotate (positive - clockwise, negative - counterclockwise) str.
     * @return Rotated String by nPos
     */
    public static String rotateString(String str, int nPos) {
        int lenStr = str.length();
        nPos = nPos % lenStr;
        if (nPos == 0) {
            return str;
        }
        char[] charStr = str.toCharArray();
        char[] result = new char[lenStr];

        for (int i = 0; i < lenStr; i++) {
            // this will work on java 1.8. For previous versions if check is not needed;
            int pos = (i + nPos) % lenStr;
            if (pos < 0) {
                pos += lenStr;
            }
            result[pos] = charStr[i];
        }
        return new String(result);
    }

}
