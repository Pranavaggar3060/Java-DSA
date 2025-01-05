package Lecture04;

public class q33 {
    public static void main(String[] args) {
        int n=10;
        int num=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            int num2=num;
            for(int j=1;j<=2*i-1;j++){
                if(j<=i){
                    if(num2==10){
                        System.out.print("0 ");
                        num2--;
                    }
                    else{
                        System.out.print(num2+" ");
                        num2++;
                    }
                }
                else{
                    System.out.print(num2+" ");
                    num2--;
                }
            }
            System.out.println();
            num--;
        }
    }
}
