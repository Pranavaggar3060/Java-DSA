package Lecture13;

public class sliding_window {
    static int compare(String s1,String s2){
        if(s1==s2){
            return 0;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return s1.charAt(i)-s2.charAt(i);
            } 
            
        }
        return s1.length()-s2.length(); 
    }
    public static String first_occ(String s1,int wind){
        String ans=s1.substring(0, wind+1);
        int i=1;
        wind++;
        while(wind<=s1.length()){
            String temp=s1.substring(i,wind);
            if(compare(ans,temp)>0){
                ans=temp;
            }
            i++;
            wind++;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(first_occ("krishna", 3));
    }
}
