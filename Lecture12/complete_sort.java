package Lecture12;

import java.util.*;

public class complete_sort {
    static void display(int[][] arr,int n,int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] input(int[][] arr , int n,int m){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    static int[] flatten(int[][] arr,int n,int m){
        int[] arr2=new int[n*m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2[i*m+j]=arr[i][j];
            }
        }
        return arr2;
    }
    static void display2(int[] arr){
        for(int i:arr)
            System.out.print(i+" ");
    }

    static int[][] build_2darr(int[] arr2,int n,int m){
        int[][] arr3=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr3[i][j]=arr2[i*m+j];
            }
        }
        return arr3;
    }
    static void sortComplete(int[][] arr,int n,int m){
        int[] arr2=flatten(arr,n,m);
        Arrays.sort(arr2);
        int[][] arr3=build_2darr(arr2,n,m);
        display(arr3,n,m);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        input(arr,n,m);
        // int[] arr2 = flatten(arr,n,m);
        // display2(arr2);
        // System.out.println();
        // int[][] arr3 = build_2darr(arr2,n,m);
        // display(arr3,n,m);
        sortComplete(arr,n,m);
    }
}
