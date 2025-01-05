package Lecture16;

public class Genarate_Paranthesis {
    static void paranthesis(int n,int l,int r,String ans){
        if(n==l && l==r){
            System.out.println(ans);
            return;
        }
        if(l>n || r>l){
            return;
        }
        paranthesis(n, l+1, r, ans+"{");
        paranthesis(n, l, r+1, ans+"}");
    }
    public static void main(String[] args) {
        paranthesis(3, 0, 0, "");
    }
}
