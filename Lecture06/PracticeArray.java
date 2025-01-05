package Lecture06;
import java.util.*;

public class PracticeArray {

    public static void display(int[] arr){
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+ " ");
        // } 
        for(int i: arr){
            System.out.print(i+" ");
        }
    }

    public static void inverse(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

    public static void input(int[] arr){
        int i=0;
        Scanner sc=new Scanner(System.in);
        while(i<arr.length){
            arr[i]= sc.nextInt();
            i++;
        }
        sc.close();
    }

    public static void swap(int[] arr,int i,int j){
        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];
    }

    static void inversecompletely(int[] arr){
        int[] brr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            brr[i]=arr[arr.length-1-i];
        }
        arr=brr;
        display(arr);
    }

    static void inversewithoutnew(int[] arr){
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int[] arr= new int[5];
        // input(arr);
        // swap(arr,4,2);
        int[] arr ={1,2,3,4,5};
        inversecompletely(arr);
        // display(arr);
        // inverse(arr);
    }
}
