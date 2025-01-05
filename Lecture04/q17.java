package Lecture04;

public class q17 {
    public static void main(String[] args) {
        int n=7;
        int totalstar=3;
        int totalspace=1;
        int i=0;
        while(i<n){
            int star=0;
            while(star<totalstar){
                System.out.print("*");
                star++;
            }
            int space=0;
            while(space<totalspace){
                System.out.print(" ");
                space++;
            }
            int star1=0;
            while(star1<totalstar){
                System.out.print("*");
                star1++;
            }

            if(i<n/2){
                totalspace+=2;
                totalstar--;
            }
            else{
                totalspace-=2;
                totalstar++; 
            }
            System.out.println();
            i++;
        }
    }
}
