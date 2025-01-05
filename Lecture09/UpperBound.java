package Lecture09;

public class UpperBound {
    static int upperbound(int[] arr, int num) {
        int l=0; 
        int h=arr.length-1;
        int ans =-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(num==arr[mid]){
                ans=mid+1;
                l=mid+1;
            }
            else if(num> arr[mid]){
                l=mid+1;
            }
            else if(num< arr[mid]){
                h=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,2,3,4,4};
        int num=4;
        System.out.println(upperbound(arr,num));
    }
}
