package Lecture04;

public class q31 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            int num=n;
            for(int j=1;j<=n;j++){
                if(j==n-i+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print(num+" ");
                }
                num--;
            }
            System.out.println();
        }
    }
}
