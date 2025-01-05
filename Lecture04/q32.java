package Lecture04;

public class q32 {
    public static void main(String[] args) {
        int n=5;
        int num=1;
        for(int i=1;i<=n+n-1;i++){
            if(i<n){
                for(int j=1;j<=2*i-1;j++){
                    if(j%2==0){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print(num+" ");
                    }
                }
                num++;
            }
            else{
                for(int j=1;j <= 2*(n-(i-n))-1;j++){
                    if(j%2==0){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print(num+" ");
                    }
                }
                num--;
            }
            System.out.println();
        }
    }
}
