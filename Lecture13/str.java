package Lecture13;

import Lecture12.sort;

public class str {
    public static void main(String[] args) {
        String s1="Pacman";
        String s2="Pacman";
        String s3= new String("Pacman");
        System.out.println(s1);
        System.out.println(s1==s2);
        // this way we are comparing their address
        System.out.println(s1==s3);
        System.out.println(s1.compareTo(s3));// gives the differnce in ascii value
        System.out.println(s3.substring(2));
        System.out.println(s3.substring(2, 5));
        System.out.println(s3.length());
        System.out.println(s3.charAt(4));
        String s5=10+12+20+s1+s3+10+12+20;
        System.out.println(s5);
        String s6=s1.concat(s3);
        System.out.println(s6);
        System.out.println(s5.toLowerCase());
        System.out.println(s6.toUpperCase());
    }
}
