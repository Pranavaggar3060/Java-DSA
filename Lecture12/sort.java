package Lecture12;

import java.util.*;

public class sort {
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
    static int[][] row_sort(int[][] arr,int n,int m){
        for(int i=0;i<arr.length;i++){
            Arrays.sort(arr[i]);
        }
        return arr;
    }
    static void column_sort(int[][] arr){
        Arrays.sort(arr,(a,b)->Integer.compare(a[0], b[0]));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        input(arr,n,m);
        row_sort(arr,n,m);
        column_sort(arr);
        display(arr,n,m);
    }
}
