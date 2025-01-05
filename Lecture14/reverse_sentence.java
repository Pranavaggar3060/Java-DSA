package Lecture14;

public class reverse_sentence {
    public static void main(String[] args) {
       String check="  coding mtalb, coding blocks";
       System.out.println(reverseString(check));
    }
    static String reverseString(String s){
        s=s.trim();
        String[] s_arr= s.split(" ");
        String ans="";
        for(int i=s_arr.length-1;i>=0;i--){
            ans+=s_arr[i];
            if (i != 0) ans += " ";
        }
        return ans;
    }
}
