package com.learning;

public class IsSorted {
    public static int isSorted(int n, int[] a) {
        int res = 1;
        // Write your code here.
        for (int i = 1; i < n; i++) {
            if (a[i - 1] > a[i]) {
                res = 0;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        //int[] arr=new int[]{0,0,0,1};
        int[] arr = new int[]{1, 2, 1, 3, 4};
        int res = isSorted(arr.length, arr);
        if (res == 1) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }

}
