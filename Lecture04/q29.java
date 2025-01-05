package Lecture04;

public class q29 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            int num=i;
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1||j==2*i-1){
                    System.out.print(num+" ");
                }
                else{
                    System.out.print("0 ");
                }
                if(j<i){
                    num++;
                }
                else{
                    num--;
                }
            }
            System.out.println();
        }
    }
}
