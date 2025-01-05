package Lecture10;

public class Reach_Center {
    static boolean check(int speed,int dist,int time){
        int dist_travelled=speed*time;
        return(dist_travelled>=dist);
    }
    static int reach_center(int dist,int time){
        int low=0;
        int high=200;
        int ans=-1;
        while(low<high){
            int mid=(low+high)/2;
            if(check(mid,dist,time)==true){
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
        int dist=100;
        int time=2;
        System.out.println(reach_center(dist,time));
    }
}
