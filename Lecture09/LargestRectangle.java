package Lecture09;

import java.util.Arrays;
public class LargestRectangle {
    static void display(int[] arr){
        for(int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
    static int[] NSEL(int[] arr){
        int[] nsel=new int[arr.length];
        Arrays.fill(nsel, -1);
        for(int i=0;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[j]<arr[i]){
                    nsel[i]=j;
                    break;
                }
            }
        }
        return nsel;
    }
    static int[] NSER(int[] arr){
        int[] nser=new int[arr.length];
        Arrays.fill(nser, arr.length);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    nser[i]=j;
                    break;
                }
            }
        }
        return nser;
    }
    static int largestarea(int[] arr,int[] nser,int[] nsel){
        int[] width=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            width[i]=nser[i]-nsel[i]-1;
        }
        int max=0;
        int area;
        for(int i=0;i<arr.length;i++){
            area=width[i]*arr[i];
            max=Math.max(area,max);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] height={2,1,5,6,2,3};
        int[] NSER=NSER(height);
        int[] NSEL=NSEL(height);
        System.out.println(largestarea(height,NSER,NSEL));
    }
}
