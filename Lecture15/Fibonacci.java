package Lecture15;

public class Fibonacci {
    static int fibo(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        int fibo1=fibo(n-1);
        int fibo2=fibo(n-2);
        return fibo1+fibo2;
    }
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }
}