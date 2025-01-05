package Lecture04;

public class q21 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=0;k<2*(n-i)-1;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                if(j==n){
                    continue;
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
