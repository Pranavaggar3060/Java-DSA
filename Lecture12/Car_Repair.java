package Lecture12;
import java.util.*;
public class Car_Repair {
    static boolean check(long time,int[] rank,int cars){
        int count=0;
        for(int i=0;i<rank.length;i++){
            count+=Math.sqrt(time/rank[i]);
        }
        return(count>=cars);
    }
    public long repairCars(int[] ranks, int cars) {
        long  low=1;
        long high=Long.MAX_VALUE;
        long ans=high;
        while(low<=high){
            long mid=high-(high-low)/2;
            if(check(mid,ranks,cars)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] ranks={1,2,3,4};
        int cars=10;
        Car_Repair carRepair = new Car_Repair();  // Create an instance
        System.out.println(carRepair.repairCars(ranks, cars)); 
    }


}
