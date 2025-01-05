package Lecture15;

public class Reverse_string {
    static String reverse(String s){
        if(s.length()==0){
            return "";
        }
        return reverse(s.substring(1))+s.charAt(0);
    }
    public static void main(String[] args) {
        String s="gfyufh";
        System.out.println(reverse(s));
    }
}
