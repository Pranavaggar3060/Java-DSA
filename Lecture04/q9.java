package Lecture04;

public class q9 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){

            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }

            for(int x=1;x<=i-1;x++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
