package com.donatasd.utils;

import java.util.List;
import java.util.ListIterator;

/**
 * Provides various sorting algorithm implementations.
 *
 * @author Donatas Daubaras
 */
public class SortingUtils {


    /**
     * Insertion sort implementation. Provides such performance (N - size of the given list):
     * Best case: O(N)
     * Average case: O(N^2)
     * Worst case: O(N^2)
     *
     * @param list {@link List} that is meant to be sorted
     * @param <T> Generic type of list's contained variables. Has to implement {@link Comparable}
     */
    public static <T extends Comparable<? super T>> void insertionSort(List<T> list) {
        Object[] array = list.toArray();
        insertionSort(array);
        ListIterator<T> iterator = list.listIterator();
        for (Object o: array) {
            iterator.next();
            iterator.set((T) o);
        }
    }

    private static <T> void insertionSort(T[] list) {
        int len = list.length;
        for (int j = 1; j < len; j++) {
            T key = list[j];
            int i = j - 1;
            while (i > -1 && ((Comparable) list[i]).compareTo(key) == 1) {
                list[i + 1] = list[i];
                i--;
            }
            list[i + 1] = key;
        }
    }
}
