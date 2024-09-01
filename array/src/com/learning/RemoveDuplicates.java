package com.learning;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

/*
Remove duplicate element from sorted array
 */
public class RemoveDuplicates {

    static Logger logger = Logger.getLogger(RemoveDuplicates.class.getName());

    /*
    Implementing brute solution which will have
    time-complexity : N log N + N
    space-complexity : O(N)
     */
    private static int removeDuplicatesBruteSol(int n, int[] a) {
        Set<Integer> intSet = new HashSet<>();
        for (int i = 0; i < n; i++)
            intSet.add(a[i]);

        Iterator<Integer> it = intSet.iterator();
        int count = 0;
        for (int i = 0; it.hasNext(); i++) {
            a[i] = it.next();
            count++;
        }
        System.out.println("array after removing duplicates " + Arrays.toString(a));
        return count;
    }

    /*
    This is optimal solution which will have
    TC:O(N)
    SC:O(1)
     */
    private static int removeDuplicates(int n, int[] a) {
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (a[i] != a[j]) {
                i++;
                a[i] = a[j];
            }
        }
        return (i + 1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 3, 3, 3, 4, 4, 5, 5};
        System.out.println("unique element count is " + removeDuplicatesBruteSol(arr.length, arr));
        System.out.println("unique element count with optimal solution is " + removeDuplicates(arr.length, arr));
    }

}
