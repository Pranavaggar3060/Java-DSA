package Lecture16;

public class All_Permutations {
    static void all_strings(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<ques.length();i++){
            char a=ques.charAt(i);
            String s1=ques.substring(0, i);
            String s2=ques.substring(i+1);
            all_strings(s1+s2, ans+a);
        }
    }
    public static void main(String[] args) {
        all_strings("abc","");
    }
}
