package com.miga.sortalgorithms;

import com.miga.sortalgorithms.common.SortUtil;

public class QuickSort {

    public static <T extends Comparable<T>> T[] sort(T array[], int left, int right) {
        int i = left;
        int j = right;
        T pivot = array[(left + right) / 2];

        while (true) {
            while (array[i].compareTo(pivot) == -1) i++;
            while (array[j].compareTo(pivot) == 1) j--;

            if (i >= j) break;

            if (array[i].compareTo(array[j]) != 0)
                SortUtil.swap(array, i, j);

            i++;
            j--;
        }

        if (left < i - 1)
            sort(array, left, i - 1);

        if (j + 1 < right)
            sort(array, j + 1, right);

        return array;
    }
}
