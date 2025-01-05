package Lecture10;

import java.util.Arrays;

public class Magnetic_Force {
    static boolean check(int force,int[] basket,int m){
        int count=1;
        int last_basket=basket[0];
        for(int i=1;i<basket.length;i++){
            if(basket[i]-last_basket>=force){
                last_basket=basket[i];
                count++;
            }
        }
        return(count>=m);
    }
    static int magnetic_force(int[] position,int m){
        Arrays.sort(position);
        int low=1;
        int high=position[position.length-1]-position[0];
        int ans=0;
        while(low<high){
            int mid=(low+high)/2;
            if(check(mid,position,m)==true){
                low=mid+1;
                ans=mid;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] position={1,2,3,4,7};
        int m=3;
        System.out.println(magnetic_force(position,m));
    }
}
