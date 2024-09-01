package com.learning;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int[] arr = LargestElement.getArr();

        System.out.println(Arrays.toString(getSecondOrderElements(arr.length, arr)));
    }

    private static int getSecondLargestElement(int n, int[] a) {
        int slargest = -1, largest = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > largest) {
                slargest = largest;
                largest = a[i];
            } else if (a[i] < largest && a[i] > slargest) {
                slargest = a[i];
            }
        }
        return slargest;
    }

    private static int getSecondSmallestElement(int n, int[] a) {
        int ssmallest = Integer.MAX_VALUE, smallest = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < smallest) {
                ssmallest = smallest;
                smallest = a[i];
            } else if (a[i] > smallest && a[i] < ssmallest) {
                ssmallest = a[i];
            }
        }
        return ssmallest;
    }

    public static int[] getSecondOrderElements(int n, int[] a) {
        // Write your code here.
        int ssmallest = getSecondSmallestElement(n, a);
        int slargest = getSecondLargestElement(n, a);
        return new int[]{slargest, ssmallest};
    }
}
