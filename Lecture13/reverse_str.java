package Lecture13;

public class reverse_str {
    public static String reverse(String str) {
        String reversed = ""; 

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {
        String original = "hello";
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reverse(original));
    }
}
