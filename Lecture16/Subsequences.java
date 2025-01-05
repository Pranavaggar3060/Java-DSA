package Lecture16;

public class Subsequences {
    static void subsequence(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char a=ques.charAt(0);
        subsequence(ques.substring(1), ans+a);
        subsequence(ques.substring(1), ans);
    }
    static int count_subsequence(String ques,String ans){
        if(ques.length()==0){
            return 1;
        }
        char a=ques.charAt(0);
        int inc=count_subsequence(ques.substring(1), ans+a);
        int ninc=count_subsequence(ques.substring(1), ans);
        return inc+ninc;
    }
    public static void main(String[] args) {
        subsequence("car", "");
        System.out.println(count_subsequence("car", ""));
    }
}
