package Lecture04;

public class q19 {
    public static void main(String[] args) {
        int n = 7;  // Size of the pattern
        int totalstar=n/2;
        int totalspace=1;

        for (int i = 0; i < n; i++) {
                if (i == 0 || i == n - 1) {
                    for (int j = 0; j < n; j++) {
                        System.out.print("*");
                    }
                } 
                else {
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

            }
            System.out.println();
        }
    }
}
