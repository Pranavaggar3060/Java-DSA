package Lecture14;
import java.util.ArrayList;
public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println(arr.size());
        arr.add(10);
        System.out.println(arr.size());
        arr.add(10);
        System.out.println(arr.size());
        System.out.println(arr);
        arr.add(1, 30);
        System.out.println(arr);
    }
}