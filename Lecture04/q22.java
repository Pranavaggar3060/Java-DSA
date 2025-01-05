package Lecture04;

public class q22 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            for(int k=1;k<2*i-2;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=n-i+1;j++){
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
