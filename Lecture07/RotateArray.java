package Lecture07;

public class RotateArray {

    static void display(int[] arr){
        for(int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    static void shiftbyone(int[] arr){
        int key = arr[arr.length - 1];
        for(int i = arr.length - 1; i > 0; i--){
            arr[i] = arr[i - 1]; 
        }
        arr[0] = key;
    }

    static void ndway(int[] arr,int start,int end){
        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void rdway(int[] arr,int k){
        int[] temp=new int[arr.length];
        int n=arr.length;
        k=k%n;
        for(int i=0;i<n-k;i++){
            temp[i+k]=arr[i];
        }
        for(int i=0;i<k;i++){
            temp[i]=arr[n-k+i];
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int  k=3;
        // for(int i=0;i<k;i++){
        //     shiftbyone(arr);
        // }
        // ndway(arr,0,arr.length-1);
        // ndway(arr,0,k-1);
        // ndway(arr,k,arr.length-1);
        rdway(arr,k);
        display(arr);
        
    }
}

