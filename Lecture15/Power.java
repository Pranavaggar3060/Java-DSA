package Lecture15;

public class Power {
    static int head_power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*head_power(x,n-1);
    }
    static int tail_power(int x,int n,int k){
        if(n==0){
            return k;
        }
        return tail_power(x,n-1,x*k);
    }
    public static void main(String[] args) {
        int k=1;
        System.out.println(head_power(4, 4));
        System.out.println(tail_power(3, 4, k));
    }
}
