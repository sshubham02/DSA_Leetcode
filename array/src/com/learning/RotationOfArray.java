package com.learning;

import java.util.Arrays;

public class RotationOfArray {
    /*
     Left Rotate an Array by One
     */
    static int[] leftRotateArrayByOne(int[] a, int n) {
        // Write your code here.
        int temp = a[0];
        for (int i = 1; i < n; i++) {
            a[i - 1] = a[i];
        }
        a[n - 1] = temp;
        return a;
    }

    /*
    rotate the array to the left by 'k' steps
     */
    static int[] leftRotateArrayByK(int[] a, int n, int k) {
        int[] newA = new int[k];
        for (int i = 0; i < k; i++) {
            newA[i] = a[i];
        }
        System.out.println("newA " + Arrays.toString(a));
        return a;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Left Rotate an Array by One " + Arrays.toString(leftRotateArrayByOne(arr, arr.length)));
    }

}
