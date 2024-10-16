package com.learning;

public class Frequency_In_A_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 3, 5, 5,
                8, 8, 8, 9, 9, 10};
        //int[] arr = {10,10,10,10,10};
        countOccurrences(arr,arr.length);
    }

    public static void countOccurrences(int[] arr, int n){
        int ele = arr[0];
        int count = 1;
        for(int i=1;i<n;i++){
            if(ele == arr[i]){
                count++;
            }else {
                System.out.println("Frequency of "+ele+" is:"+count);
                ele=arr[i];
                count=1;
            }
        }
        System.out.println("Frequency of "+ele+" is:"+count);
    }
}
