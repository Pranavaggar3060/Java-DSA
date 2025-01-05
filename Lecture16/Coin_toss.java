package Lecture16;

public class Coin_toss {
    static void coin_toss(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        coin_toss(n-1, ans+"H");
        coin_toss(n-1, ans+"T");
    }
    public static void main(String[] args) {
        coin_toss(3, "");
    }
}
