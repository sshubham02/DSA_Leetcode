package com.learning;

import java.util.*;

public class LeadersInArray {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(7,10,4,10,6,5,2);
        //List<Integer> arr = Arrays.asList(30,20,10);
        System.out.println("naive_leaders_in_arrays : " + naive_leaders_in_arrays(arr,arr.size()));
        System.out.println("optimal_leaders_in_arrays : " + optimal_leaders_in_arrays(arr,arr.size()));
    }

    private static List<Integer> naive_leaders_in_arrays(List<Integer> elements, int n){
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            boolean flag = false;
            for(int j=i+1;j<n;j++){
                if(elements.get(j)>=elements.get(i)){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                result.add(elements.get(i));
            }
        }
        return result;
    }

    private static List<Integer> optimal_leaders_in_arrays(List<Integer> elements, int n){
        List<Integer> result = new ArrayList<>();
        int max = elements.get(n-1);
        result.add(max);
        for(int i=n-2;i>=0;i--){
            if(elements.get(i)>max){
                max=elements.get(i);
                result.add(max);
            }
        }
        result.sort(Collections.reverseOrder());
        return result;

    }
}
