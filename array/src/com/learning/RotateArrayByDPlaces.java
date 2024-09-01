package com.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArrayByDPlaces {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] c = {1, 2, 3, 4, 5, 6, 7};
        Integer[] b = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> arr = new ArrayList<>(Arrays.asList(b));
        System.out.println("naive_left_rotate_array_k_places : " + Arrays.toString(naive_left_rotate_array_k_places(a, 4)));
        System.out.println("optimised_left_rotate_array_k_places : " + Arrays.toString(optimised_left_rotate_array_k_places(c, 4)));
        System.out.println("optimised_left_rotate_array_k_places_with_arrayList : " + optimised_left_rotate_array_k_places_with_arrayList(arr, 4));

        int[] e = {-1, -100, 3, 99};
        int[] d = {1, 2, 3, 4, 5, 6, 7};
        naive_right_rotate_array_k_places(d, 3);
        optimised_right_rotate_array_k_places(e, 3);
        System.out.println("naive_right_rotate_array_k_places : " + Arrays.toString(d));
        System.out.println("optimised_right_rotate_array_k_places : " + Arrays.toString(e));
    }

    /*
    Naive approach for array rotation by k places
     */
    private static int[] naive_left_rotate_array_k_places(int[] a, int k) {
        k = k % a.length;
        int n = a.length;
        int l = 0;
        if (k == 0) {
            return a;
        }
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = a[i];
        }

        for (int i = k; i < n; i++) {
            a[i - k] = a[i];
        }

        for (int i = n - k; i < n; i++) {
            a[i] = temp[l];
            l++;
        }

        return a;
    }

    private static void naive_right_rotate_array_k_places(int[] a, int k) {
        int n = a.length;
        k = k % n;
        int[] temp = new int[k];
        int j = 0;

        for (int i = n - k; i < n; i++) {
            temp[j] = a[i];
            j++;
        }

        for (int i = (n - k) - 1; i >= 0; i--) {
            a[k + i] = a[i];
        }

        for (int i = 0; i < k; i++) {
            a[i] = temp[i];
        }
    }


    private static int[] optimised_left_rotate_array_k_places(int[] a, int k) {
        int n = a.length;
        k = k % n;
        reverse(a, 0, k);
        reverse(a, k, n);
        reverse(a, 0, n);
        return a;
    }

    private static void optimised_right_rotate_array_k_places(int[] a, int k) {
        int n = a.length;
        k = k % n;
        reverse(a, k, n);
        reverse(a, 0, k);
        reverse(a, 0, n);
    }

    private static void reverse(int[] a, int start, int end) {
        int temp = 0;
        end = end - 1;
        while (start <= end) {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    private static List<Integer> optimised_left_rotate_array_k_places_with_arrayList(List<Integer> arr, int k) {
        int n = arr.size();
        k = k % n;
        reverse(arr, 0, k);
        reverse(arr, k, n);
        reverse(arr, 0, n);
        return arr;
    }

    private static void reverse(List<Integer> arr, int start, int end) {
        int temp = -1;
        int j = end - 1;
        int i = start;
        while (i <= j) {
            temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
    }


}
