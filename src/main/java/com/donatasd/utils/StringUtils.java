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

}
