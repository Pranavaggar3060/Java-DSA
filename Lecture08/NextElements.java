package Lecture08;
import java.util.*;

public class NextElements {

    static void display(int[] arr){
        for(int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    static int[] NGER(int[] arr){
        int maxE =0;
        int[] nger=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            nger[i]=maxE;
            maxE=Math.max(maxE,arr[i]);
        }
        return nger;
    }
    static int[] NGEL(int[] arr){
        int maxE =0;
        int[] nger=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            nger[i]=maxE;
            maxE=Math.max(maxE,arr[i]);
        }
        return nger;
    }
    static int[] NSEL(int[] arr){
        int minE =Integer.MAX_VALUE;
        int[] nsel=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            nsel[i]=minE;
            minE=Math.min(minE,arr[i]);
        }
        return nsel;
    }
    static int[] NSER(int[] arr){
        int minE =Integer.MAX_VALUE;;
        int[] nser=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            nser[i]=minE;
            minE=Math.min(minE,arr[i]);
        }
        return nser;
    }
    public static void main(String[] args) {
        int[] arr={7,8,5,6,3,4,1,2};
        int[] result = NSER(arr);
        display(result);
    }
}
