package Lecture09;
import java.util.*;

public class BinarySearch {
    static boolean binarysearch(int[] arr,int num){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==num){
                return true;
            }
            else if(arr[mid]<num){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={6,7,8,9,10,11,12,13};
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(binarysearch(arr,num));
    }
}
