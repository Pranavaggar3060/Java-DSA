package Lecture04;

public class q18 {
    public static void main(String[] args) {
        int n=7;
        int totalspace=3;
        int totalstar=1;
        int i=0;
        while(i<n){
            int space=0;
            while(space<totalspace){
                System.out.print(" ");
                space++;
            }
            int star=0;
            while(star<totalstar){
                System.out.print("*");
                star++;
            }

            if(i<n/2){
                totalstar+=2;
                totalspace--;
            }
            else{
                totalstar-=2;
                totalspace++; 
            }
            System.out.println();
            i++;
        }
    }
}
