package Lecture14;

public class S_Builder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hi, ");
        sb.ensureCapacity(100);
        sb.append("this is a new string");
        System.out.println(sb.length());
        System.out.println(sb.capacity());//default value= 16
        System.out.println(sb);
        sb.insert(3, "DOGS");
        System.out.println(sb);
        sb.replace(6,9, "I love java");
        System.out.println(sb);
        sb.delete(0, 5);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}