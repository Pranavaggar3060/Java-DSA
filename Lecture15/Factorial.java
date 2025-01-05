package Lecture15;

public class Factorial {
    static int head_fact(int n){
        if(n==1){
            return 1;
        }
        return n*head_fact(n-1);
    }
    static int tail_fact(int n,int k){
        if(n==1){
            return k;
        }
        return tail_fact(n-1,n*k);
    }
    public static void main(String[] args) {
        int n=5;
        int k=1;
        System.out.println(head_fact(n));
        System.out.println(tail_fact(n, k));
    }
}
