package Lecture10;

import java.util.*;

public class kok0_eat_banana {
    static boolean check(int speed,int[] piles,int h){
        int count=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]%speed!=0){
                count++;
                count+=piles[i]/speed;
            }
            else{
                count+=piles[i]/speed;
            }
        }
        return(count<=h);
    }
    static int speed(int[] piles,int h){
        Arrays.sort(piles);
        int low=1;
        int high = piles[piles.length-1];
        int ans=-1;
        while(low<=high){
            int mid=high-(high-low)/2;
            if(check(mid,piles,h)==true){
                high=mid-1;
                ans=mid;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] piles={3,6,7,11};
        int h=8;
        System.out.println(speed(piles,h));
    }
}
