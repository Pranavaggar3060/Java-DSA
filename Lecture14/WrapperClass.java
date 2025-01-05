package Lecture14;

public class WrapperClass {
    public static void main(String[] args) {
        int n1=10;
        Integer n2=10;
        System.out.println(n1+" "+n2);
        Integer n6=127;
        Integer n3=127;
        Integer n4=128;
        Integer n5=128;
        System.out.println(n6==n3);
        System.out.println(n4==n5);
        System.out.println(n4.equals(n5));
    }
}
