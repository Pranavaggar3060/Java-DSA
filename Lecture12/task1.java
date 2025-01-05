package Lecture12;
import java.util.*;
public class task1 {
    static void display(int[][] arr,int n,int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int sum(int[][] arr,int n,int m){
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        input(arr,n,m);
        display(arr,n,m);
        int sum=sum(arr,n,m);
        System.out.println(sum);
    }
}

