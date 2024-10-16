package com.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,0,0,2,3};
        int[] b = new int[]{10,5,0,0,8,0,9,0};
        int[] c = new int[]{10,5,0,0,8,0,9,0};
        naive_move_zeros(arr.length,arr);
        System.out.println("naive_move_zeros : "+Arrays.toString(arr));
        System.out.println("optimal_move_zeros : "+Arrays.toString(optimal_move_zeros(b.length,b)));
        System.out.println("better_move_zeros : "+Arrays.toString(better_move_zeros(c.length,c)));
    }

    private static void naive_move_zeros(int n,int[] a){
        List<Integer> temp = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                temp.add(a[i]);
            }
        }

        for(int i=0;i<temp.size();i++){
            a[i] = temp.get(i);
        }

        for(int i=temp.size();i<n;i++){
            a[i] = 0;
        }
    }

    private static int[] optimal_move_zeros(int n, int[] a){
        int temp=0;
        int j=-1;
        for(int i=0;i<n;i++){
            if(a[i]==0){
              j=i;
              break;
            }
        }
        if(j== -1) return a;
        for(int i=j+1;i<n;i++){
            if(a[i]!=0){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        return a;
    }

    private static int[] better_move_zeros(int n, int[] a){
        int count=0;
        int temp=0;
        for(int i=0;i<n;i++){
            if(a[i] != 0){
                temp = a[i];
                a[i] = a[count];
                a[count] = temp;
                count++;
            }
        }
        return a;
    }
}
