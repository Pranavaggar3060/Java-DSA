package Lecture03;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        boolean b=true;

        for(int i=2;i<n;i++){
            if(n%i==0){
                b=false;
                break;
            }
        }
        
        if(b==true){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
