package Lecture04;

public class q15 {
   public static void main(String[] args) {
    int n=5;
    for(int i=1;i<=n;i++){

        for(int k=1;k<=2*(i-1);k++){
            System.out.print("  ");
        }

        for(int j=1;j<=n-i+1;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    for(int i=2;i<=n;i++){

        for(int k=1;k<=2*(n-i);k++){
            System.out.print("  ");
        }

        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
   }
}
