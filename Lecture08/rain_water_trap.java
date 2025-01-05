package Lecture08;

public class rain_water_trap {
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
    public static void main(String[] args) {
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        int[] ngel=NGEL(height);
        int[] nger=NGER(height);
        int[] level=new int[height.length];
        for(int i=0;i<level.length;i++){
            level[i]=Math.min(nger[i],ngel[i]);
        }
        int capacity=0;
        for(int i=0;i<level.length;i++){
            int temp=level[i]-height[i];
            if(temp>0){
                capacity+=temp;
            }
        }
        System.out.println(capacity);
    }
}
