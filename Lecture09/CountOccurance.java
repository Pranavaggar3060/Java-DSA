package Lecture09;

public class CountOccurance {
    static int lowerbound(int[] arr, int num) {
        int l=0; 
        int h=arr.length-1;
        int ans =-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(num==arr[mid]){
                ans=mid;
                h=mid-1;
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
        int[] arr={1,1,1,2,3,4,4,4,4,5,5};
        int num=5;
        int occurance=upperbound(arr,num)-lowerbound(arr,num);
        System.out.println(occurance);
    }
}
