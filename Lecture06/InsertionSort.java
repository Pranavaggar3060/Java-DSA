package Lecture06;

import java.util.Arrays;

public class InsertionSort {
    static void display(int[] arr){
        for(int i:arr)
            System.out.print(i+" ");
    }
    //insertion sort
    static void insertionSort(int arr[]){
        // int n= arr.length;
        //
        for(int i=1;i<arr.length;i++){
            int key= arr[i];
            int j= i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]= arr[j];
                --j;
            }
            arr[j+1]= key;
        }
    }
    
    public static void main(String[] args) {
        int[] arr= {10,89,76,45,78,34,60};
        insertionSort(arr);
        display(arr);
    }
}
